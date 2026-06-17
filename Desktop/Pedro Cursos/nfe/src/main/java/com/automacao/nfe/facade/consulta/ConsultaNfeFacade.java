package com.automacao.nfe.facade.consulta;

import com.automacao.nfe.domain.consulta.ConsultaNfeResponseDto;

public interface ConsultaNfeFacade {

    ConsultaNfeResponseDto consultar(String uuid);

}