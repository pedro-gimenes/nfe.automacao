package com.automacao.nfe.domain.empresa;

import java.time.LocalDateTime;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record EmpresaNfeResponseDto(

        Long id,

        String cnpj,

        String razaoSocial,

        String nomeFantasia,

        String cidade,

        String uf,

        LocalDateTime dataAtualizacao

) implements SnakeCasesStrategy {
}