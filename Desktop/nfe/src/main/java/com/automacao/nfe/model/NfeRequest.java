package com.automacao.nfe.model;

import lombok.Data;

@Data
public class NfeRequest {
    private String natureza_operacao;
    private String nome;
    private String cpf;
    private String produto;
    private Double valor;
}

