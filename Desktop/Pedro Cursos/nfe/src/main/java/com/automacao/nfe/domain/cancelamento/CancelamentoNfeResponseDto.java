package com.automacao.nfe.domain.cancelamento;

import java.time.LocalDateTime;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record CancelamentoNfeResponseDto(
        String uuid,

        String status,

        String justificativa,

        LocalDateTime dataCancelamento) implements SnakeCasesStrategy {}
