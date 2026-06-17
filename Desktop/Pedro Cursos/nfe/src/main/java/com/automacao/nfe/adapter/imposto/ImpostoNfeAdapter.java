package com.automacao.nfe.adapter.imposto;

import com.automacao.nfe.domain.imposto.ImpostoNfeRequestDto;
import com.automacao.nfe.domain.imposto.ImpostoNfeResponseDto;
import com.automacao.nfe.model.imposto.ImpostoNfeModel;

public interface ImpostoNfeAdapter {

    ImpostoNfeModel toModel(
            ImpostoNfeRequestDto dto);

    ImpostoNfeResponseDto toResponse(
            ImpostoNfeModel model);

}
