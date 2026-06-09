package com.automacao.nfe.exception;

public class EmissaoNfeException
        extends RuntimeException {

    public EmissaoNfeException(
            String message
    ) {
        super(message);
    }

}