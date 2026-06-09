package com.automacao.nfe.domain.emissao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

import java.time.LocalDateTime;
import java.util.List;

public record EmissaoNfeRequestDto(

        String id,

        Integer operacao,

        String naturezaOperacao,

        Integer finalidade,

        LocalDateTime dataEmissao,

        LocalDateTime dataEntradaSaida,

        List<String> nfeReferenciada,

        ClienteDto cliente,

        List<ProdutoDto> produtos,

        PedidoDto pedido,

        Boolean previaDanfe,

        Boolean assincrono

) implements SnakeCasesStrategy {
}