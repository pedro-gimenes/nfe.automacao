package com.automacao.nfe.domain.relatorio;

import java.time.LocalDate;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record RelatorioNfeRequestDto(

        String tipoArquivo,

        LocalDate dataInicial,

        LocalDate dataFinal,

        String status,

        String chave,

        String uuid

) implements SnakeCasesStrategy {
}
