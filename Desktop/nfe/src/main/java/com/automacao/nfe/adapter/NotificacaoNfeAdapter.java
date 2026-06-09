package com.automacao.nfe.adapter;

import com.automacao.nfe.domain.notificacao.NotificacaoNfeDto;

public interface NotificacaoNfeAdapter {

    void atualizarStatus(
            NotificacaoNfeDto request
    );
}