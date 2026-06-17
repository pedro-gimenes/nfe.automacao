package com.automacao.nfe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automacao.nfe.domain.autenticacao.AuthRequestDto;
import com.automacao.nfe.domain.autenticacao.AuthResponseDto;
import com.automacao.nfe.helper.TokenHelper;
import com.automacao.nfe.model.Usuario;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;

    private final TokenHelper tokenHelper;

      @PostMapping("/login")
      public ResponseEntity<AuthResponseDto> login(@Valid @RequestBody AuthRequestDto dto) {

        var authenticationToken = new UsernamePasswordAuthenticationToken(

                        dto.username(),

                        dto.password()

                );

        var authentication = authenticationManager.authenticate(authenticationToken);

        Usuario usuario = (Usuario) authentication.getPrincipal();

        String token = tokenHelper.gerarToken(usuario);

        return ResponseEntity.ok(new AuthResponseDto(token, "Bearer"));
    }

}