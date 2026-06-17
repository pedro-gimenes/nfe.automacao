package com.automacao.nfe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.automacao.nfe.model.emissao.EmissaoNfeModel;

@Repository
public interface EmissaoNfeRepository
        extends JpaRepository<EmissaoNfeModel, Long> {

    Optional<EmissaoNfeModel> findByUuid(
            String uuid
    );

    Optional<EmissaoNfeModel> findByPedidoId(
            String pedidoId
    );
}