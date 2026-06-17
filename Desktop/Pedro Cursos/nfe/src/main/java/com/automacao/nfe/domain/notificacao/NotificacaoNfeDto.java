package com.automacao.nfe.domain.notificacao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record NotificacaoNfeDto(

        String uuid,
        String status,
        String motivo,
        Integer nfe,
        Integer serie,
        String recibo,
        String chave,
        String modelo,
        Boolean epec,
        String xml,
        String danfe,
        String log,
        String data,
        String logCancelamento

) implements SnakeCasesStrategy {
}