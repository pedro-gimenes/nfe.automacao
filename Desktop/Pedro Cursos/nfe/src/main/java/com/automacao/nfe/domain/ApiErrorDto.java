package com.automacao.nfe.domain;

import java.time.LocalDateTime;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record ApiErrorDto(

        LocalDateTime timestamp,

        Integer status,

        String message

) implements SnakeCasesStrategy {
}