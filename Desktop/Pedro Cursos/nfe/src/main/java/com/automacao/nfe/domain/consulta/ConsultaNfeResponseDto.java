package com.automacao.nfe.domain.consulta;

import java.time.LocalDateTime;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record ConsultaNfeResponseDto(

        String uuid,

        String status,

        String motivo,

        String numeroNfe,

        String serie,

        String chaveAcesso,

        Integer modelo,

        Boolean epec,

        String xmlUrl,

        String danfeUrl,

        LocalDateTime dataEmissao,

        LocalDateTime dataCancelamento

) implements SnakeCasesStrategy {

}