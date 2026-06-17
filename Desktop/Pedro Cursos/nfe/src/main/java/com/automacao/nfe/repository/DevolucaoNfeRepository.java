package com.automacao.nfe.repository;

import com.automacao.nfe.model.devolucao.DevolucaoNfeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DevolucaoNfeRepository
        extends JpaRepository<DevolucaoNfeModel, Long> {

    Optional<DevolucaoNfeModel> findByUuid(String uuid);

}