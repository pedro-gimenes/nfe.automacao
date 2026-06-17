package com.automacao.nfe.helper;

import org.springframework.stereotype.Component;

import com.automacao.nfe.domain.empresa.EmpresaNfeRequestDto;
import com.automacao.nfe.exceptions.BusinessException;

@Component
public class EmpresaNfeHelper {

    public void validar(
            EmpresaNfeRequestDto dto) {

        if(dto.cnpj() == null
                || dto.cnpj().isBlank()) {

            throw new BusinessException(
                    "CNPJ é obrigatório");
        }

        if(dto.razaoSocial() == null
                || dto.razaoSocial().isBlank()) {

            throw new BusinessException(
                    "Razão Social é obrigatória");
        }

        if(dto.uf() == null
                || dto.uf().length() != 2) {

            throw new BusinessException(
                    "UF inválida");
        }

        if(dto.email() == null
                || dto.email().isBlank()) {

            throw new BusinessException(
                    "Email é obrigatório");
        }

    }

}