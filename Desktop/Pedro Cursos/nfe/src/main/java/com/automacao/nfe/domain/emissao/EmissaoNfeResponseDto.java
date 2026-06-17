package com.automacao.nfe.domain.emissao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record EmissaoNfeResponseDto(

        String uuid,

        String status,

        String motivo,

        String numeroNfe,

        String serie,

        String chaveAcesso,

        String xmlUrl,

        String danfeUrl

) implements SnakeCasesStrategy {
}