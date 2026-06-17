package com.automacao.nfe.domain.imposto;

import java.util.List;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record ImpostoNfeRequestDto(

        String referencia,

        String descricao,

        List<IcmsDto> icms,

        List<IpiDto> ipi,

        List<PisDto> pis,

        List<CofinsDto> cofins,

        String informacoesFisco,

        String informacoesComplementares

) implements SnakeCasesStrategy {
}