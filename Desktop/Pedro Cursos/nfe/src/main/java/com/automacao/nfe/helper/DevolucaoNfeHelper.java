package com.automacao.nfe.helper;

import com.automacao.nfe.domain.devolucao.DevolucaoNfeRequestDto;
import com.automacao.nfe.exceptions.BusinessException;
import org.springframework.stereotype.Component;

@Component
public class DevolucaoNfeHelper {

    public void validar(
            DevolucaoNfeRequestDto dto) {

        if(dto.id() == null) {

            throw new BusinessException(
                    "ID é obrigatório");
        }

        if(dto.operacao() == null) {

            throw new BusinessException(
                    "Operação é obrigatória");
        }

        if(dto.operacao() != 0
                && dto.operacao() != 1) {

            throw new BusinessException(
                    "Operação deve ser 0 (Entrada) ou 1 (Saída)");
        }

        if(dto.chaveNfeOrigem() == null
                || dto.chaveNfeOrigem().isBlank()) {

            throw new BusinessException(
                    "Chave da NF original é obrigatória");
        }

        if(dto.chaveNfeOrigem().length() != 44) {

            throw new BusinessException(
                    "Chave da NF deve possuir 44 caracteres");
        }

        if(dto.produtos() == null
                || dto.produtos().isEmpty()) {

            throw new BusinessException(
                    "É obrigatório informar produtos");
        }

    }

}