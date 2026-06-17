package com.automacao.nfe.service.empresa.impl;

import org.springframework.stereotype.Service;

import com.automacao.nfe.model.empresa.EmpresaNfeModel;
import com.automacao.nfe.repository.EmpresaNfeRepository;
import com.automacao.nfe.service.empresa.EmpresaNfeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpresaNfeServiceImpl implements EmpresaNfeService {

    private final EmpresaNfeRepository repository;

    @Override
    public EmpresaNfeModel salvar(EmpresaNfeModel model) {

        return repository.save(model);
    }

}