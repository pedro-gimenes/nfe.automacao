package com.automacao.nfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.automacao.nfe.model.relatorio.RelatorioNfeModel;

@Repository
public interface RelatorioNfeRepository
        extends JpaRepository<RelatorioNfeModel, Long> {
}
