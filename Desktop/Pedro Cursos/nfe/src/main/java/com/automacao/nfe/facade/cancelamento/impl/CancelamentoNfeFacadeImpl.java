package com.automacao.nfe.facade.cancelamento.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.automacao.nfe.adapter.cancelamento.CancelamentoNfeAdapter;
import com.automacao.nfe.domain.cancelamento.CancelamentoNfeRequestDto;
import com.automacao.nfe.domain.cancelamento.CancelamentoNfeResponseDto;
import com.automacao.nfe.facade.cancelamento.CancelamentoNfeFacade;
import com.automacao.nfe.helper.CancelamentoNfeHelper;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;
import com.automacao.nfe.service.cancelamento.CancelamentoNfeService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CancelamentoNfeFacadeImpl implements CancelamentoNfeFacade {

    private final CancelamentoNfeService service;

    private final CancelamentoNfeAdapter adapter;

    private final CancelamentoNfeHelper helper;

    @Override
    public CancelamentoNfeResponseDto cancelar(
            String uuid,
            CancelamentoNfeRequestDto dto) {

        EmissaoNfeModel model =
                service.buscarPorUuid(uuid);

        helper.validarCancelamento(model);

        model.setStatus("CANCELADA");

        model.setJustificativaCancelamento(
                dto.justificativa());

        model.setDataCancelamento(
                LocalDateTime.now());

        model = service.salvar(model);

        return adapter.toResponseDto(model);

    }

}