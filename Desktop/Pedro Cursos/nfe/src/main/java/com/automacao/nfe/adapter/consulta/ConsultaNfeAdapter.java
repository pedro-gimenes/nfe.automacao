package com.automacao.nfe.adapter.consulta;

import com.automacao.nfe.domain.consulta.ConsultaNfeResponseDto;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;

public interface ConsultaNfeAdapter {

    ConsultaNfeResponseDto toResponseDto(
            EmissaoNfeModel model);

}