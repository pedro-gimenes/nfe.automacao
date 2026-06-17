package com.automacao.nfe.domain.imposto;

import java.time.LocalDateTime;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record ImpostoNfeResponseDto(

        Long id,

        String referencia,

        String descricao,

        LocalDateTime dataCriacao

) implements SnakeCasesStrategy {}
