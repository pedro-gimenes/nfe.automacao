package com.automacao.nfe.model.emissao;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_nfe_produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProdutoNfeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer item;

    private String nome;

    private String codigo;

    private String ncm;

    private String cest;

    private String unidade;

    private Integer origem;

    @Column(precision = 15, scale = 4)
    private BigDecimal quantidade;

    @Column(precision = 15, scale = 4)
    private BigDecimal peso;

    @Column(precision = 15, scale = 2)
    private BigDecimal subtotal;

    @Column(precision = 15, scale = 2)
    private BigDecimal desconto;

    @Column(precision = 15, scale = 2)
    private BigDecimal total;

    private String classeImposto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nfe_id")
    private EmissaoNfeModel nfe;
}