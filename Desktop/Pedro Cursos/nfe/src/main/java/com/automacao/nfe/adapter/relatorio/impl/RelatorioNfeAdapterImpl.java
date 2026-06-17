package com.automacao.nfe.adapter.relatorio.impl;

import org.springframework.stereotype.Component;

import com.automacao.nfe.adapter.relatorio.RelatorioNfeAdapter;
import com.automacao.nfe.domain.relatorio.RelatorioNfeRequestDto;
import com.automacao.nfe.domain.relatorio.RelatorioNfeResponseDto;
import com.automacao.nfe.model.relatorio.RelatorioNfeModel;

@Component
public class RelatorioNfeAdapterImpl
        implements RelatorioNfeAdapter {

    @Override
    public RelatorioNfeModel toModel(
            RelatorioNfeRequestDto dto) {

        return RelatorioNfeModel.builder()

                .tipoArquivo(
                        dto.tipoArquivo())

                .dataInicial(
                        dto.dataInicial())

                .dataFinal(
                        dto.dataFinal())

                .status(
                        dto.status())

                .chave(
                        dto.chave())

                .uuid(
                        dto.uuid())

                .build();

    }

    @Override
    public RelatorioNfeResponseDto toResponse(
            RelatorioNfeModel model) {

        return new RelatorioNfeResponseDto(

                model.getId(),

                model.getTipoArquivo(),

                model.getNomeArquivo(),

                model.getCaminhoArquivo(),

                model.getDataGeracao()

        );

    }

}
