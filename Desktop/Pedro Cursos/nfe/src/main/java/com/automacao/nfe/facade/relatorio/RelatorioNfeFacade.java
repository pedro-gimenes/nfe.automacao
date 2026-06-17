package com.automacao.nfe.facade.relatorio;

import com.automacao.nfe.domain.relatorio.RelatorioNfeRequestDto;
import com.automacao.nfe.domain.relatorio.RelatorioNfeResponseDto;

public interface RelatorioNfeFacade {

    RelatorioNfeResponseDto gerar(RelatorioNfeRequestDto dto);

}
