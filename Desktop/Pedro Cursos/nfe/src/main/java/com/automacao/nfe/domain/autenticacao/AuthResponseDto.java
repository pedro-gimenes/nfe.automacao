package com.automacao.nfe.domain.autenticacao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record AuthResponseDto(

        String token,

        String tipo

) implements SnakeCasesStrategy {

}