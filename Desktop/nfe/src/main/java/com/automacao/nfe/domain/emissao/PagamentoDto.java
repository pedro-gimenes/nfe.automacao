package com.automacao.nfe.domain.emissao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PagamentoDto(

        String formaPagamento,

        String descricaoPagamento,

        LocalDate dataPagamento,

        Integer tipoIntegracao,

        BigDecimal valorPagamento,

        String cnpjCredenciadora,

        String bandeira,

        String autorizacao,

        String cnpjBeneficiario,

        String idTerminalPag

) implements SnakeCasesStrategy {
}