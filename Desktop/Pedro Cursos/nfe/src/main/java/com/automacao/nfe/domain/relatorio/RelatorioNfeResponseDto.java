package com.automacao.nfe.domain.relatorio;

import java.time.LocalDateTime;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record RelatorioNfeResponseDto(

        Long id,

        String tipoArquivo,

        String nomeArquivo,

        String caminhoArquivo,

        LocalDateTime dataGeracao

) implements SnakeCasesStrategy {
}
