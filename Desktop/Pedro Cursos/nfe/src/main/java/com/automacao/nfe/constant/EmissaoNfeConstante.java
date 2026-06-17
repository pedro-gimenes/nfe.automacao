package com.automacao.nfe.constant;

public final class EmissaoNfeConstante {

    public static final String OPERACAO_OBRIGATORIA =
            "Operação é obrigatória.";

    public static final String OPERACAO_INVALIDA =
            "Operação deve ser 0 (entrada) ou 1 (saída).";

    public static final String CLIENTE_OBRIGATORIO =
            "CPF ou CNPJ deve ser informado.";

    public static final String DATA_EMISSAO_FUTURA =
            "Data de emissão não pode ser futura.";

    private EmissaoNfeConstante() {
    }
}