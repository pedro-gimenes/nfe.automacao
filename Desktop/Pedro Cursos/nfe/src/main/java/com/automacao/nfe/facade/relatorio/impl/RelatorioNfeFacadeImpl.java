package com.automacao.nfe.facade.relatorio.impl;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.automacao.nfe.adapter.relatorio.RelatorioNfeAdapter;
import com.automacao.nfe.domain.relatorio.RelatorioNfeRequestDto;
import com.automacao.nfe.domain.relatorio.RelatorioNfeResponseDto;
import com.automacao.nfe.facade.relatorio.RelatorioNfeFacade;
import com.automacao.nfe.helper.RelatorioNfeHelper;
import com.automacao.nfe.model.relatorio.RelatorioNfeModel;
import com.automacao.nfe.service.relatorio.RelatorioNfeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RelatorioNfeFacadeImpl
        implements RelatorioNfeFacade {

    private final RelatorioNfeAdapter adapter;

    private final RelatorioNfeService service;

    private final RelatorioNfeHelper helper;

    @Override
    public RelatorioNfeResponseDto gerar(

            RelatorioNfeRequestDto dto) {

        helper.validar(dto);

        RelatorioNfeModel model =

                adapter.toModel(dto);

        model.setDataGeracao(

                LocalDateTime.now());

        model.setNomeArquivo(

                UUID.randomUUID()

                        + "."

                        + dto.tipoArquivo()

                        .toLowerCase());

        model.setCaminhoArquivo(

                "/relatorios/"

                        + model.getNomeArquivo());

        RelatorioNfeModel salvo =

                service.salvar(model);

        return adapter.toResponse(

                salvo);

    }

}
