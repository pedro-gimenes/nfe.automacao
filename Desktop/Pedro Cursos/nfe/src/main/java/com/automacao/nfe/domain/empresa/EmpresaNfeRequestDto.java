package com.automacao.nfe.domain.empresa;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record EmpresaNfeRequestDto(

        String cnpj,

        String razaoSocial,

        String nomeFantasia,

        String ie,

        String endereco,

        String numero,

        String complemento,

        String bairro,

        String cidade,

        String uf,

        String cep,

        String telefone,

        String email,

        String regimeTributario

) implements SnakeCasesStrategy {
}