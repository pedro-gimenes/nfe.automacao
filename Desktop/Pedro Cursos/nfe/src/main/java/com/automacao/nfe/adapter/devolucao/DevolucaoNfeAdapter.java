package com.automacao.nfe.adapter.devolucao;

import com.automacao.nfe.domain.devolucao.DevolucaoNfeRequestDto;
import com.automacao.nfe.domain.devolucao.DevolucaoNfeResponseDto;
import com.automacao.nfe.model.devolucao.DevolucaoNfeModel;

public interface DevolucaoNfeAdapter {

    DevolucaoNfeModel toModel(
            DevolucaoNfeRequestDto dto);

    DevolucaoNfeResponseDto toResponse(
            DevolucaoNfeModel model);

}