package com.automacao.nfe.domain.imposto;

import java.math.BigDecimal;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record CofinsDto(

        String cenario,

        String tipoPessoa,

        String situacaoTributaria,

        BigDecimal aliquota

) implements SnakeCasesStrategy {
}
