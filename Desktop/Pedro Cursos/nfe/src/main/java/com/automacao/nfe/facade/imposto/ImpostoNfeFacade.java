package com.automacao.nfe.facade.imposto;

import java.util.List;

import com.automacao.nfe.domain.imposto.ImpostoNfeRequestDto;
import com.automacao.nfe.domain.imposto.ImpostoNfeResponseDto;

public interface ImpostoNfeFacade {

    ImpostoNfeResponseDto salvar(
            ImpostoNfeRequestDto dto);

    List<ImpostoNfeResponseDto> listar();

    void excluir(
            String referencia);

}
