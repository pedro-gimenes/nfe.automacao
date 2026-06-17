package com.automacao.nfe.domain.autenticacao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

import jakarta.validation.constraints.NotBlank;

public record AuthRequestDto(

        @NotBlank
        String username,

        @NotBlank
        String password

) implements SnakeCasesStrategy {

}