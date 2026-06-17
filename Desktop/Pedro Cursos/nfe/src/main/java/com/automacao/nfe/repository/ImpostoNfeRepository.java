package com.automacao.nfe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.automacao.nfe.model.imposto.ImpostoNfeModel;

@Repository
public interface ImpostoNfeRepository
        extends JpaRepository<ImpostoNfeModel, Long>{

    Optional<ImpostoNfeModel>
            findByReferencia(String referencia);

    void deleteByReferencia(String referencia);

}
