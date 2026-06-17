package com.automacao.nfe.exceptions;

public class EmissaoNfeException
        extends RuntimeException {

    public EmissaoNfeException(
            String message
    ) {
        super(message);
    }

}