package com.automacao.nfe.adapter.cancelamento.impl;

import org.springframework.stereotype.Component;

import com.automacao.nfe.adapter.cancelamento.CancelamentoNfeAdapter;
import com.automacao.nfe.domain.cancelamento.CancelamentoNfeResponseDto;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;

@Component
public class CancelamentoNfeAdapterImpl implements CancelamentoNfeAdapter {

    @Override
    public CancelamentoNfeResponseDto toResponseDto(
            EmissaoNfeModel model) {

        return new CancelamentoNfeResponseDto(

                model.getUuid(),

                model.getStatus(),

                model.getJustificativaCancelamento(),

                model.getDataCancelamento()

        );

    }

}