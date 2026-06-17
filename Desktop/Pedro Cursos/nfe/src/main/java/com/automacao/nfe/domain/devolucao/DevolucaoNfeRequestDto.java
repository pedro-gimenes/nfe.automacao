package com.automacao.nfe.domain.devolucao;

import java.time.LocalDateTime;
import java.util.List;

import com.automacao.nfe.domain.emissao.ClienteDto;
import com.automacao.nfe.domain.emissao.PedidoDto;
import com.automacao.nfe.domain.emissao.ProdutoDto;
import com.automacao.nfe.utils.SnakeCasesStrategy;

public record DevolucaoNfeRequestDto(

        String id,

        Integer operacao,

        String naturezaOperacao,

        Integer modelo,

        Integer finalidade,

        String chaveNfeOrigem,

        LocalDateTime dataEmissao,

        LocalDateTime dataEntradaSaida,

        ClienteDto cliente,

        List<ProdutoDto> produtos,

        PedidoDto pedido

) implements SnakeCasesStrategy {
}