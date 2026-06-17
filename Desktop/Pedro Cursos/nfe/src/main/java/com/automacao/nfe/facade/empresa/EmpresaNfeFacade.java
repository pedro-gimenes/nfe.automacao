package com.automacao.nfe.facade.empresa;

import com.automacao.nfe.domain.empresa.EmpresaNfeRequestDto;
import com.automacao.nfe.domain.empresa.EmpresaNfeResponseDto;

public interface EmpresaNfeFacade {

    EmpresaNfeResponseDto salvar(EmpresaNfeRequestDto dto);

}