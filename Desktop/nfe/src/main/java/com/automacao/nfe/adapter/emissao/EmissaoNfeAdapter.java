package com.automacao.nfe.adapter.emissao;

import com.automacao.nfe.domain.emissao.EmissaoNfeRequestDto;
import com.automacao.nfe.domain.emissao.EmissaoNfeResponseDto;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EmissaoNfeAdapter {

    public EmissaoNfeModel toEntity(
            EmissaoNfeRequestDto dto
    ) {

        EmissaoNfeModel entity =
                new EmissaoNfeModel();

        entity.setUuid(
                UUID.randomUUID().toString()
        );

        entity.setPedidoId(dto.id());

        entity.setOperacao(
                dto.operacao()
        );

        entity.setNaturezaOperacao(
                dto.naturezaOperacao()
        );

        entity.setFinalidade(
                dto.finalidade()
        );

        entity.setDataEmissao(
                dto.dataEmissao()
        );

        entity.setDataEntradaSaida(
                dto.dataEntradaSaida()
        );

        entity.setStatus("PROCESSANDO");

        return entity;
    }

    public EmissaoNfeResponseDto toResponseDto(
            EmissaoNfeModel entity
    ) {

        return new EmissaoNfeResponseDto(
                entity.getUuid(),
                entity.getStatus(),
                entity.getMotivo(),
                entity.getNumeroNfe(),
                entity.getSerie(),
                entity.getChaveAcesso(),
                entity.getXmlUrl(),
                entity.getDanfeUrl()
        );
    }
}