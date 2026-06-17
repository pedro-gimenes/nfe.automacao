package com.automacao.nfe.model.imposto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_imposto_nfe")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImpostoNfeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String referencia;

    private String descricao;

    @Column(columnDefinition = "TEXT")
    private String informacoesFisco;

    @Column(columnDefinition = "TEXT")
    private String informacoesComplementares;

    private LocalDateTime dataCriacao;

}
