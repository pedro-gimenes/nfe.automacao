package com.automacao.nfe.service.emissao.impl;

import org.springframework.stereotype.Service;

import com.automacao.nfe.adapter.emissao.EmissaoNfeAdapter;
import com.automacao.nfe.domain.emissao.EmissaoNfeRequestDto;
import com.automacao.nfe.domain.emissao.EmissaoNfeResponseDto;
import com.automacao.nfe.facade.emissao.EmissaoNfeFacade;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;
import com.automacao.nfe.service.emissao.EmissaoNfeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmissaoNfeServiceImpl
        implements EmissaoNfeService {

    private final EmissaoNfeFacade facade;
    private final EmissaoNfeAdapter adapter;

    @Override
    public EmissaoNfeResponseDto emitir(
            EmissaoNfeRequestDto request
    ) {

        EmissaoNfeModel entity =
                facade.emitir(request);

        return adapter.toResponseDto(entity);
    }
}