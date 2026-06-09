package com.automacao.nfe.domain.autenticacao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

public record UsuarioDto(
      String name,
      String cpf,
      String email,
      String password) implements SnakeCasesStrategy {}
