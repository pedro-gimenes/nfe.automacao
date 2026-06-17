package com.automacao.nfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automacao.nfe.model.empresa.EmpresaNfeModel;

public interface EmpresaNfeRepository extends JpaRepository<EmpresaNfeModel, Long> {
    
    
}
