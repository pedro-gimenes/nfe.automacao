package com.automacao.nfe.adapter.devolucao.impl;

import com.automacao.nfe.adapter.devolucao.DevolucaoNfeAdapter;
import com.automacao.nfe.domain.devolucao.DevolucaoNfeRequestDto;
import com.automacao.nfe.domain.devolucao.DevolucaoNfeResponseDto;
import com.automacao.nfe.model.devolucao.DevolucaoNfeModel;
import org.springframework.stereotype.Component;

@Component
public class DevolucaoNfeAdapterImpl implements DevolucaoNfeAdapter {

    @Override
    public DevolucaoNfeModel toModel(DevolucaoNfeRequestDto dto) {

        return DevolucaoNfeModel.builder()

                .numeroPedido(dto.id())

                .operacao(dto.operacao())

                .naturezaOperacao(
                        dto.naturezaOperacao())

                .modelo(dto.modelo())

                .finalidade(dto.finalidade())

                .chaveNfeOrigem(
                        dto.chaveNfeOrigem())

                .dataEmissao(
                        dto.dataEmissao())

                .dataEntradaSaida(
                        dto.dataEntradaSaida())

                .build();
    }

    @Override
    public DevolucaoNfeResponseDto toResponse(
            DevolucaoNfeModel model) {

        return new DevolucaoNfeResponseDto(

                model.getId(),

                model.getUuid(),

                model.getStatus(),

                model.getMotivo(),

                model.getChave(),

                model.getXml(),

                model.getDanfe(),

                model.getDataCriacao()
        );
    }

}