package com.automacao.nfe.domain.enums;

public enum OperacaoNfe {

    ENTRADA(0),
    SAIDA(1);

    private final Integer codigo;

    OperacaoNfe(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }
}