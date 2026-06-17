package com.automacao.nfe.adapter.imposto.impl;

import org.springframework.stereotype.Component;

import com.automacao.nfe.adapter.imposto.ImpostoNfeAdapter;
import com.automacao.nfe.domain.imposto.ImpostoNfeRequestDto;
import com.automacao.nfe.domain.imposto.ImpostoNfeResponseDto;
import com.automacao.nfe.model.imposto.ImpostoNfeModel;

@Component
public class ImpostoNfeAdapterImpl
        implements ImpostoNfeAdapter {

    @Override
    public ImpostoNfeModel toModel(
            ImpostoNfeRequestDto dto) {

        return ImpostoNfeModel.builder()

                .referencia(
                        dto.referencia())

                .descricao(
                        dto.descricao())

                .informacoesFisco(
                        dto.informacoesFisco())

                .informacoesComplementares(
                        dto.informacoesComplementares())

                .build();

    }

    @Override
    public ImpostoNfeResponseDto toResponse(
            ImpostoNfeModel model) {

        return new ImpostoNfeResponseDto(

                model.getId(),

                model.getReferencia(),

                model.getDescricao(),

                model.getDataCriacao()

        );
    }

}
