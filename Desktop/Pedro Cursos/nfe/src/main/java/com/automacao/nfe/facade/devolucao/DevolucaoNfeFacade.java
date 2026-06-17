package com.automacao.nfe.facade.devolucao;

import com.automacao.nfe.domain.devolucao.DevolucaoNfeRequestDto;
import com.automacao.nfe.domain.devolucao.DevolucaoNfeResponseDto;

public interface DevolucaoNfeFacade {

    DevolucaoNfeResponseDto emitir(
            DevolucaoNfeRequestDto dto);

}