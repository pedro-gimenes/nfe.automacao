package com.automacao.nfe.domain.devolucao;

import java.time.LocalDateTime;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record DevolucaoNfeResponseDto(

        Long id,

        String uuid,

        String status,

        String motivo,

        String chave,

        String xml,

        String danfe,

        LocalDateTime dataCriacao

) implements SnakeCasesStrategy {
}