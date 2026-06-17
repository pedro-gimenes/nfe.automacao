package com.automacao.nfe.facade.empresa.impl;

import com.automacao.nfe.adapter.empresa.EmpresaNfeAdapter;
import com.automacao.nfe.domain.empresa.EmpresaNfeRequestDto;
import com.automacao.nfe.domain.empresa.EmpresaNfeResponseDto;
import com.automacao.nfe.facade.empresa.EmpresaNfeFacade;
import com.automacao.nfe.helper.EmpresaNfeHelper;
import com.automacao.nfe.model.empresa.EmpresaNfeModel;
import com.automacao.nfe.service.empresa.EmpresaNfeService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EmpresaNfeFacadeImpl
        implements EmpresaNfeFacade {

    private final EmpresaNfeAdapter adapter;

    private final EmpresaNfeService service;

    private final EmpresaNfeHelper helper;

    @Override
    public EmpresaNfeResponseDto salvar(
            EmpresaNfeRequestDto dto) {

        helper.validar(dto);

        EmpresaNfeModel model =
                adapter.toModel(dto);

        model.setDataAtualizacao(
                LocalDateTime.now());

        EmpresaNfeModel salvo =
                service.salvar(model);

        return adapter.toResponse(salvo);
    }

}
