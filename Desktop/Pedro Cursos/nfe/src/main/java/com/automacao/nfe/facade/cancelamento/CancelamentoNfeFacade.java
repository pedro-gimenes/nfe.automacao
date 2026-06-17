package com.automacao.nfe.facade.cancelamento;

import com.automacao.nfe.domain.cancelamento.CancelamentoNfeRequestDto;
import com.automacao.nfe.domain.cancelamento.CancelamentoNfeResponseDto;

public interface CancelamentoNfeFacade {

    CancelamentoNfeResponseDto cancelar(
            String uuid,
            CancelamentoNfeRequestDto dto);

}