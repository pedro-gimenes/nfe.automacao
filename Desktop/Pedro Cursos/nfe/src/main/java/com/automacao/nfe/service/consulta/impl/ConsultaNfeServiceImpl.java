package com.automacao.nfe.service.consulta.impl;

import org.springframework.stereotype.Service;

import com.automacao.nfe.model.emissao.EmissaoNfeModel;
import com.automacao.nfe.repository.EmissaoNfeRepository;
import com.automacao.nfe.service.consulta.ConsultaNfeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConsultaNfeServiceImpl
        implements ConsultaNfeService {

    private final EmissaoNfeRepository repository;

    @Override
    public EmissaoNfeModel buscarPorUuid(String uuid) {

        return repository.findByUuid(uuid)
                .orElse(null);

    }

}