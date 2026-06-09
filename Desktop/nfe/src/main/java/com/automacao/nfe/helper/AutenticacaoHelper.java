package com.automacao.nfe.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.automacao.nfe.repository.UsuarioRepository;

@Service
public class AutenticacaoHelper implements UserDetailsService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(Long id) throws UsernameNotFoundException {
        return usuarioRepository.findById(id);
    }

}
