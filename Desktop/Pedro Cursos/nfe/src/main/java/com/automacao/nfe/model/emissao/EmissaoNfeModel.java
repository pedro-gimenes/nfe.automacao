package com.automacao.nfe.model.emissao;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name = "pedido_externo")
    private String pedidoId;

    private Integer operacao;

    private String naturezaOperacao;

    private Integer modelo;

    private Integer finalidade;

    private LocalDateTime dataEmissao;

    private LocalDateTime dataEntradaSaida;

    private LocalDateTime dataCancelamento;

    @Column(length = 255)
    private String justificativaCancelamento;

    private String status;

    private String motivo;

    private String numeroNfe;

    private String serie;

    private String chaveAcesso;

    private Boolean epec;

    private String xmlUrl;

    private String danfeUrl;

    @OneToOne(cascade = CascadeType.ALL)
    private ClienteNfeModel cliente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ProdutoNfeModel> produtos;

    @OneToOne(cascade = CascadeType.ALL)
    private PedidoNfeModel pedido;

}