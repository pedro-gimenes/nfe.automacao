package com.automacao.nfe.domain.imposto;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record IcmsDto(

        String tipoTributacao,

        String cenario,

        String tipoPessoa,

        String codigoCfop,

        String situacaoTriburaria

) implements SnakeCasesStrategy {}
