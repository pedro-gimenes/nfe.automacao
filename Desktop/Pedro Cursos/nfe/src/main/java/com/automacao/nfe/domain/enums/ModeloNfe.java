package com.automacao.nfe.domain.enums;

public enum ModeloNfe {

    NFE(1);

    private final Integer codigo;

    ModeloNfe(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }
}