package com.automacao.nfe.service.imposto.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.automacao.nfe.model.imposto.ImpostoNfeModel;
import com.automacao.nfe.repository.ImpostoNfeRepository;
import com.automacao.nfe.service.imposto.ImpostoNfeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImpostoNfeServiceImpl implements ImpostoNfeService {

    private final ImpostoNfeRepository repository;

    @Override
    public ImpostoNfeModel salvar(
            ImpostoNfeModel model) {

        return repository.save(model);
    }

    @Override
    public List<ImpostoNfeModel> listar() {

        return repository.findAll();
    }

    @Override
    public void excluir(
            String referencia) {

        repository.deleteByReferencia(
                referencia);
    }

}