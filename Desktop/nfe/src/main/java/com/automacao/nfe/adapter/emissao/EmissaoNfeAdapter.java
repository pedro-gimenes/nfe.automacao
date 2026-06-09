package com.automacao.nfe.adapter.emissao;

import com.automacao.nfe.domain.emissao.EmissaoNfeRequestDto;
import com.automacao.nfe.domain.emissao.EmissaoNfeResponseDto;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;

public interface EmissaoNfeAdapter {

    EmissaoNfeModel toEntity(
            EmissaoNfeRequestDto request
    );

    EmissaoNfeResponseDto toResponseDto(
            EmissaoNfeModel entity
    );
}