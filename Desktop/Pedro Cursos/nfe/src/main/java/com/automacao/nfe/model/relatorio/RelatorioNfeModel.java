package com.automacao.nfe.model.relatorio;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name = "tb_relatorio_nfe")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RelatorioNfeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoArquivo;

    private String nomeArquivo;

    private String caminhoArquivo;

    private LocalDate dataInicial;

    private LocalDate dataFinal;

    private String status;

    private String chave;

    private String uuid;

    private LocalDateTime dataGeracao;

}