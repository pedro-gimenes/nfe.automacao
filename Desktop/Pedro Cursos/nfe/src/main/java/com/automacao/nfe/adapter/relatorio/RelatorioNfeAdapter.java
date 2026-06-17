package com.automacao.nfe.adapter.relatorio;

import com.automacao.nfe.domain.relatorio.RelatorioNfeRequestDto;
import com.automacao.nfe.domain.relatorio.RelatorioNfeResponseDto;
import com.automacao.nfe.model.relatorio.RelatorioNfeModel;

public interface RelatorioNfeAdapter {

    RelatorioNfeModel toModel(
            RelatorioNfeRequestDto dto);

    RelatorioNfeResponseDto toResponse(
            RelatorioNfeModel model);

}