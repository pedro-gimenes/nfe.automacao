package com.automacao.nfe.helper;

import java.util.List;

import org.springframework.stereotype.Component;
import com.automacao.nfe.domain.relatorio.RelatorioNfeRequestDto;
import com.automacao.nfe.exceptions.BusinessException;

@Component
public class RelatorioNfeHelper {

    public void validar(
            RelatorioNfeRequestDto dto) {

        if(dto.tipoArquivo() == null
                || dto.tipoArquivo().isBlank()) {

            throw new BusinessException(
                    "Tipo de arquivo é obrigatório");
        }

        if(!List.of("CSV","XML","DANFE")

                .contains(

                        dto.tipoArquivo()

                                .toUpperCase())) {

            throw new BusinessException(

                    "Tipo de arquivo inválido");

        }

    }

}
