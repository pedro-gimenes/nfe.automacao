package com.automacao.nfe.model.emissao;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_nfe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmissaoNfeModel {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    private String pedidoId;

    private Integer operacao;

    private String naturezaOperacao;

    private Integer finalidade;

    private LocalDateTime dataEmissao;

    private LocalDateTime dataEntradaSaida;

    private String status;

    private String motivo;

    private String numeroNfe;

    private String serie;

    private String chaveAcesso;

    private String xmlUrl;

    private String danfeUrl;

    @OneToOne(
        cascade = CascadeType.ALL
    )
    private ClienteNfeModel cliente;

    @OneToMany(
        cascade = CascadeType.ALL
    )
    private List<ProdutoNfeModel> produtos;

    @OneToOne(
        cascade = CascadeType.ALL
    )
    private PedidoNfeModel pedido;
}