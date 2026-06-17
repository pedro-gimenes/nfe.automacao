package com.automacao.nfe.model.devolucao;

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
@Table(name = "tb_devolucao_nfe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DevolucaoNfeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    private String numeroPedido;

    private Integer operacao;

    private String naturezaOperacao;

    private Integer modelo;

    private Integer finalidade;

    private String chaveNfeOrigem;

    private String status;

    private String motivo;

    private String chave;

    private String xml;

    private String danfe;

    private LocalDateTime dataEmissao;

    private LocalDateTime dataEntradaSaida;

    private LocalDateTime dataCriacao;

}