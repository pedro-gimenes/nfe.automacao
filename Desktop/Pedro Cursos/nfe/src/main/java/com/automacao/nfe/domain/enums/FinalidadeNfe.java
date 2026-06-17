package com.automacao.nfe.domain.enums;

public enum FinalidadeNfe {

    NORMAL(1),
    DEVOLUCAO(4);

    private final Integer codigo;

    FinalidadeNfe(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }
}