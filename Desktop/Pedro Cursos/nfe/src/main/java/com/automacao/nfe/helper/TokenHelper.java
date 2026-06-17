package com.automacao.nfe.helper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.automacao.nfe.model.Usuario;

@Component
public class TokenHelper {

    @Value("${api.security.token.secret}")
    private String secret;

    public String gerarToken(Usuario usuario) {

        try {

            Algorithm algoritmo = Algorithm.HMAC256(secret);

            return JWT.create()
                    .withIssuer("API automacao.nfe")
                    .withSubject(usuario.getUsername())
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritmo);

        } catch (JWTCreationException exception) {

            throw new RuntimeException(
                    "Erro ao gerar token JWT",
                    exception
            );

        }

    }

    public String getSubject(String tokenJWT) {

        try {

            Algorithm algoritmo = Algorithm.HMAC256(secret);

            return JWT.require(algoritmo)
                    .withIssuer("API automacao.nfe")
                    .build()
                    .verify(tokenJWT)
                    .getSubject();

        } catch (JWTVerificationException exception) {

            throw new RuntimeException(
                    "Token JWT inválido ou expirado",
                    exception
            );

        }

    }

    private Instant dataExpiracao() {

        return LocalDateTime.now()
                .plusHours(2)
                .toInstant(
                        ZoneOffset.ofHours(-3)
                );

    }

}