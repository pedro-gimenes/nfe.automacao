package com.automacao.nfe.domain.emissao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

import java.math.BigDecimal;

public record ProdutoDto(

        Integer item,

        String nome,

        String codigo,

        String ncm,

        String cest,

        String unidade,

        Integer origem,

        BigDecimal quantidade,

        BigDecimal peso,

        BigDecimal subtotal,

        BigDecimal desconto,

        BigDecimal total,

        String classeImposto,

        String beneficioFiscal,

        String informacoesAdicionais,

        String gtin,

        String gtinTributavel

) implements SnakeCasesStrategy {
}