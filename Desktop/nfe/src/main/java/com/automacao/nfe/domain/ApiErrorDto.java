package com.automacao.nfe.domain;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record ApiErrorDto(

        Integer status,

        String message

) implements SnakeCasesStrategy {
}