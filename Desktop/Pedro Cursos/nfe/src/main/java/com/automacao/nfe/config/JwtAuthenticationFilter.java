package com.automacao.nfe.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.automacao.nfe.helper.TokenHelper;
import com.automacao.nfe.repository.UsuarioRepository;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private TokenHelper tokenHelper;

    @Autowired
    private UsuarioRepository repository;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        var tokenJWT = recuperarToken(request);

        if (tokenJWT != null) {

            var username = tokenHelper.getSubject(tokenJWT);

            var usuario = repository.findByUsername(username);

            if (usuario.isPresent()) {

                var authentication = new UsernamePasswordAuthenticationToken(usuario.get(), null, usuario.get().getAuthorities());

                SecurityContextHolder
                        .getContext()
                        .setAuthentication(authentication);

            }

        }

        filterChain.doFilter(request, response);

    }

    private String recuperarToken(HttpServletRequest request) {

        var authorizationHeader = request.getHeader("Authorization");

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {

            return authorizationHeader.replace("Bearer ", "");

        }

        return null;

    }

}