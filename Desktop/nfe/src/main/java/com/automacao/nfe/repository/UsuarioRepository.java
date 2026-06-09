package com.automacao.nfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automacao.nfe.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
