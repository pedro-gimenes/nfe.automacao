package com.automacao.nfe.service.emissao;
import com.automacao.nfe.domain.emissao.EmissaoNfeRequestDto;
import com.automacao.nfe.domain.emissao.EmissaoNfeResponseDto;

    public interface EmissaoNfeService {

    EmissaoNfeResponseDto emitir(
            EmissaoNfeRequestDto request
    );
}
