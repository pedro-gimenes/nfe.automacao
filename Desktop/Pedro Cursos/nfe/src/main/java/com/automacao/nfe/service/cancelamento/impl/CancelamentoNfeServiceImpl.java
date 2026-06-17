package com.automacao.nfe.service.cancelamento.impl;

import org.springframework.stereotype.Service;

import com.automacao.nfe.model.emissao.EmissaoNfeModel;
import com.automacao.nfe.repository.EmissaoNfeRepository;
import com.automacao.nfe.service.cancelamento.CancelamentoNfeService;

@Service
public class CancelamentoNfeServiceImpl implements CancelamentoNfeService {

    private final EmissaoNfeRepository repository;

    public CancelamentoNfeServiceImpl(EmissaoNfeRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmissaoNfeModel buscarPorUuid(String uuid) {

        return repository.findByUuid(uuid)
                .orElse(null);

    }

    @Override
    public EmissaoNfeModel salvar(EmissaoNfeModel model) {

        return repository.save(model);

    }

}
