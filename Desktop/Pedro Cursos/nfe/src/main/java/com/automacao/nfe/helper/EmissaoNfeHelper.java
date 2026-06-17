package com.automacao.nfe.helper;

import java.time.LocalDateTime;

import com.automacao.nfe.exceptions.EmissaoNfeException;

public final class EmissaoNfeHelper {

    private EmissaoNfeHelper() {
    }

    public static void validarDataEmissao(
            LocalDateTime dataEmissao
    ) {

        if (dataEmissao == null) {
            return;
        }

        if (dataEmissao.isAfter(LocalDateTime.now())) {

            throw new EmissaoNfeException(
                    "Data de emissão não pode ser futura."
            );
        }
    }

    public static void validarDataEntradaSaida(
            LocalDateTime dataEntradaSaida
    ) {

        if (dataEntradaSaida == null) {
            return;
        }

        if (dataEntradaSaida.isAfter(LocalDateTime.now())) {

            throw new EmissaoNfeException(
                    "Data de entrada/saída não pode ser futura."
            );
        }
    }

    public static void validarCpfOuCnpj(
            String cpf,
            String cnpj
    ) {

        boolean possuiCpf =
                cpf != null
                        && !cpf.isBlank();

        boolean possuiCnpj =
                cnpj != null
                        && !cnpj.isBlank();

        if (!possuiCpf && !possuiCnpj) {

            throw new EmissaoNfeException(
                    "CPF ou CNPJ deve ser informado."
            );
        }
    }

    public static void validarOperacao(
            Integer operacao
    ) {

        if (operacao == null) {

            throw new EmissaoNfeException(
                    "Operação é obrigatória."
            );
        }

        if (operacao != 0
                && operacao != 1) {

            throw new EmissaoNfeException(
                    "Operação deve ser 0 (entrada) ou 1 (saída)."
            );
        }
    }

    public static void validarValorPositivo(
            Number valor,
            String campo
    ) {

        if (valor == null) {

            throw new EmissaoNfeException(
                    campo + " é obrigatório."
            );
        }

        if (valor.doubleValue() <= 0) {

            throw new EmissaoNfeException(
                    campo + " deve ser maior que zero."
            );
        }
    }

    public static void validarTextoObrigatorio(
            String valor,
            String campo
    ) {

        if (valor == null
                || valor.isBlank()) {

            throw new EmissaoNfeException(
                    campo + " é obrigatório."
            );
        }
    }
}