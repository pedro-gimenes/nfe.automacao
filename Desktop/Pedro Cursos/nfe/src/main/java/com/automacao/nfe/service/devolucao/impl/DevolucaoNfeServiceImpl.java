package com.automacao.nfe.service.devolucao.impl;

import com.automacao.nfe.model.devolucao.DevolucaoNfeModel;
import com.automacao.nfe.repository.DevolucaoNfeRepository;
import com.automacao.nfe.service.devolucao.DevolucaoNfeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DevolucaoNfeServiceImpl
        implements DevolucaoNfeService {

    private final DevolucaoNfeRepository repository;

    @Override
    public DevolucaoNfeModel salvar(
            DevolucaoNfeModel model) {

        return repository.save(model);
    }

}