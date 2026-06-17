package com.automacao.nfe.domain.imposto;

import java.math.BigDecimal;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record IpiDto(

        String cenario,

        String tipoPessoa,

        String situacaoTributaria,

        String codigoEnquadramento,

        BigDecimal aliquota

) implements SnakeCasesStrategy {}