package com.automacao.nfe.adapter.empresa;

import com.automacao.nfe.domain.empresa.EmpresaNfeRequestDto;
import com.automacao.nfe.domain.empresa.EmpresaNfeResponseDto;
import com.automacao.nfe.model.empresa.EmpresaNfeModel;

public interface EmpresaNfeAdapter {

    EmpresaNfeModel toModel(
            EmpresaNfeRequestDto dto);

    EmpresaNfeResponseDto toResponse(
            EmpresaNfeModel model);

}