package com.automacao.nfe.service.relatorio.impl;

import org.springframework.stereotype.Service;

import com.automacao.nfe.model.relatorio.RelatorioNfeModel;
import com.automacao.nfe.repository.RelatorioNfeRepository;
import com.automacao.nfe.service.relatorio.RelatorioNfeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RelatorioNfeServiceImpl
        implements RelatorioNfeService {

    private final RelatorioNfeRepository repository;

    @Override
    public RelatorioNfeModel salvar(
            RelatorioNfeModel model) {

        return repository.save(model);

    }

}
