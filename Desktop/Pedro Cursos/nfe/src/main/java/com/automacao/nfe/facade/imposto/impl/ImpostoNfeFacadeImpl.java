package com.automacao.nfe.facade.imposto.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.automacao.nfe.adapter.imposto.ImpostoNfeAdapter;
import com.automacao.nfe.domain.imposto.ImpostoNfeRequestDto;
import com.automacao.nfe.domain.imposto.ImpostoNfeResponseDto;
import com.automacao.nfe.facade.imposto.ImpostoNfeFacade;
import com.automacao.nfe.helper.ImpostoNfeHelper;
import com.automacao.nfe.model.imposto.ImpostoNfeModel;
import com.automacao.nfe.service.imposto.ImpostoNfeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImpostoNfeFacadeImpl
        implements ImpostoNfeFacade {

    private final ImpostoNfeAdapter adapter;

    private final ImpostoNfeService service;

    private final ImpostoNfeHelper helper;

    @Override
    public ImpostoNfeResponseDto salvar(
            ImpostoNfeRequestDto dto) {

        helper.validar(dto);

        ImpostoNfeModel model =
                adapter.toModel(dto);

        model.setDataCriacao(
                LocalDateTime.now());

        ImpostoNfeModel salvo =
                service.salvar(model);

        return adapter.toResponse(
                salvo);

    }

    @Override
    public List<ImpostoNfeResponseDto> listar() {

        return service
                .listar()

                .stream()

                .map(adapter::toResponse)

                .toList();
    }

    @Override
    public void excluir(
            String referencia) {

        service.excluir(referencia);

    }

}
