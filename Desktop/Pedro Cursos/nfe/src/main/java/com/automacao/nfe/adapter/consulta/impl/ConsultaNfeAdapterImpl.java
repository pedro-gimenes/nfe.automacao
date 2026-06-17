package com.automacao.nfe.adapter.consulta.impl;

import org.springframework.stereotype.Component;

import com.automacao.nfe.adapter.consulta.ConsultaNfeAdapter;
import com.automacao.nfe.domain.consulta.ConsultaNfeResponseDto;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;

@Component
public class ConsultaNfeAdapterImpl implements ConsultaNfeAdapter {

    @Override
    public ConsultaNfeResponseDto toResponseDto(EmissaoNfeModel model) {

        return new ConsultaNfeResponseDto(

                model.getUuid(),

                model.getStatus(),

                model.getMotivo(),

                model.getNumeroNfe(),

                model.getSerie(),

                model.getChaveAcesso(),

                model.getModelo(),

                model.getEpec(),

                model.getXmlUrl(),

                model.getDanfeUrl(),

                model.getDataEmissao(),

                model.getDataCancelamento()

        );

    }

}