package com.automacao.nfe.adapter.empresa.impl;

import org.springframework.stereotype.Component;
import com.automacao.nfe.adapter.empresa.EmpresaNfeAdapter;
import com.automacao.nfe.domain.empresa.EmpresaNfeRequestDto;
import com.automacao.nfe.domain.empresa.EmpresaNfeResponseDto;
import com.automacao.nfe.model.empresa.EmpresaNfeModel;

@Component
public class EmpresaNfeAdapterImpl implements EmpresaNfeAdapter {

    @Override
    public EmpresaNfeModel toModel(
            EmpresaNfeRequestDto dto) {

        return EmpresaNfeModel.builder()

                .cnpj(dto.cnpj())

                .razaoSocial(dto.razaoSocial())

                .nomeFantasia(dto.nomeFantasia())

                .ie(dto.ie())

                .endereco(dto.endereco())

                .numero(dto.numero())

                .complemento(dto.complemento())

                .bairro(dto.bairro())

                .cidade(dto.cidade())

                .uf(dto.uf())

                .cep(dto.cep())

                .telefone(dto.telefone())

                .email(dto.email())

                .regimeTributario(
                        dto.regimeTributario())

                .build();
    }

    @Override
    public EmpresaNfeResponseDto toResponse(
            EmpresaNfeModel model) {

        return new EmpresaNfeResponseDto(

                model.getId(),

                model.getCnpj(),

                model.getRazaoSocial(),

                model.getNomeFantasia(),

                model.getCidade(),

                model.getUf(),

                model.getDataAtualizacao()

        );
    }

}