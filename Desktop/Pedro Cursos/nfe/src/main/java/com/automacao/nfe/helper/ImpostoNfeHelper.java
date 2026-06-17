package com.automacao.nfe.helper;

import org.springframework.stereotype.Component;

import com.automacao.nfe.domain.imposto.ImpostoNfeRequestDto;
import com.automacao.nfe.exceptions.BusinessException;

@Component
public class ImpostoNfeHelper {

    public void validar(
            ImpostoNfeRequestDto dto){

        if(dto.descricao() == null
                || dto.descricao().isBlank()) {

            throw new BusinessException(
                    "Descrição é obrigatória");
        }

        if(dto.icms() == null
                || dto.icms().isEmpty()) {

            throw new BusinessException(
                    "ICMS é obrigatório");
        }

    }

}