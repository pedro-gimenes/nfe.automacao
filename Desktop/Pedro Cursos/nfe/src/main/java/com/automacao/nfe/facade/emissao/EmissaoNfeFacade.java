package com.automacao.nfe.facade.emissao;

import com.automacao.nfe.domain.emissao.EmissaoNfeRequestDto;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;

public interface EmissaoNfeFacade {

    EmissaoNfeModel emitir(
            EmissaoNfeRequestDto request
    );
}