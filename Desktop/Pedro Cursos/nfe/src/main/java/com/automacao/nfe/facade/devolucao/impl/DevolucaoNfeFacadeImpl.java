package com.automacao.nfe.facade.devolucao.impl;

import com.automacao.nfe.model.devolucao.DevolucaoNfeModel;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.automacao.nfe.adapter.devolucao.DevolucaoNfeAdapter;
import com.automacao.nfe.domain.devolucao.DevolucaoNfeRequestDto;
import com.automacao.nfe.domain.devolucao.DevolucaoNfeResponseDto;
import com.automacao.nfe.facade.devolucao.DevolucaoNfeFacade;
import com.automacao.nfe.helper.DevolucaoNfeHelper;
import com.automacao.nfe.service.devolucao.DevolucaoNfeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DevolucaoNfeFacadeImpl
        implements DevolucaoNfeFacade {

    private final DevolucaoNfeAdapter adapter;

    private final DevolucaoNfeService service;

    private final DevolucaoNfeHelper helper;

    @Override
    public DevolucaoNfeResponseDto emitir(
            DevolucaoNfeRequestDto dto) {

        helper.validar(dto);

        DevolucaoNfeModel model =
                adapter.toModel(dto);

        model.setUuid(UUID.randomUUID().toString());

        model.setStatus("PROCESSANDO");

        model.setDataCriacao(
                LocalDateTime.now());

        DevolucaoNfeModel salvo =
                service.salvar(model);

        return adapter.toResponse(salvo);
    }

}