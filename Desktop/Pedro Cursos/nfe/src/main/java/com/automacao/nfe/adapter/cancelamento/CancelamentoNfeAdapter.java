package com.automacao.nfe.adapter.cancelamento;

import com.automacao.nfe.domain.cancelamento.CancelamentoNfeResponseDto;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;

public interface CancelamentoNfeAdapter {

    CancelamentoNfeResponseDto toResponseDto(
            EmissaoNfeModel model);

    
}
