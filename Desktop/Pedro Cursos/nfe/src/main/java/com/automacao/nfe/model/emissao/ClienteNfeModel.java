package com.automacao.nfe.model.emissao;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_nfe_cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteNfeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cpf;

    private String cnpj;

    private String nomeCompleto;

    private String razaoSocial;

    private String ie;

    private String endereco;

    private String complemento;

    private String numero;

    private String bairro;

    private String cidade;

    private String uf;

    private String cep;

    private String telefone;

    private String email;
}