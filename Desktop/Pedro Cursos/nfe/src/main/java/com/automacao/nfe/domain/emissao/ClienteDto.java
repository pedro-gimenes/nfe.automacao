package com.automacao.nfe.domain.emissao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record ClienteDto(

        String cpf,

        String nomeCompleto,

        String cnpj,

        String razaoSocial,

        String ie,

        String suframa,

        Integer consumidorFinal,

        Integer contribuinte,

        String endereco,

        String complemento,

        String numero,

        String bairro,

        String cidade,

        String uf,

        String cep,

        String telefone,

        String email

) implements SnakeCasesStrategy {
}