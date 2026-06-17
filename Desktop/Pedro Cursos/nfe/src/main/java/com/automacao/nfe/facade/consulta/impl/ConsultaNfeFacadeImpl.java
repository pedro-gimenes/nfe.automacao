package com.automacao.nfe.facade.consulta.impl;

import org.springframework.stereotype.Component;

import com.automacao.nfe.adapter.consulta.ConsultaNfeAdapter;
import com.automacao.nfe.domain.consulta.ConsultaNfeResponseDto;
import com.automacao.nfe.facade.consulta.ConsultaNfeFacade;
import com.automacao.nfe.helper.ConsultaNfeHelper;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;
import com.automacao.nfe.service.consulta.ConsultaNfeService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ConsultaNfeFacadeImpl implements ConsultaNfeFacade {

    private final ConsultaNfeService service;

    private final ConsultaNfeAdapter adapter;

    private final ConsultaNfeHelper helper;

    @Override
    public ConsultaNfeResponseDto consultar(
            String uuid) {

        EmissaoNfeModel model =
                service.buscarPorUuid(uuid);

        helper.validarConsulta(model);

        return adapter.toResponseDto(model);

    }

}