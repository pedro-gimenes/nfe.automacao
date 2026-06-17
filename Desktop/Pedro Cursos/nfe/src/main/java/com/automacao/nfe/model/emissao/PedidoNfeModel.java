package com.automacao.nfe.model.emissao;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_nfe_pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PedidoNfeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer pagamento;

    private Integer presenca;

    private Integer modalidadeFrete;

    @Column(precision = 15, scale = 2)
    private BigDecimal frete;

    @Column(precision = 15, scale = 2)
    private BigDecimal desconto;

    @Column(precision = 15, scale = 2)
    private BigDecimal despesasAcessorias;

    @Column(precision = 15, scale = 2)
    private BigDecimal total;

    @Column(length = 2000)
    private String informacoesFisco;

    @Column(length = 5000)
    private String informacoesComplementares;
}