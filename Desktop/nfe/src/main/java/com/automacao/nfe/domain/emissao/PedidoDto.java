package com.automacao.nfe.domain.emissao;

import com.automacao.nfe.utils.SnakeCasesStrategy;

import java.math.BigDecimal;
import java.util.List;

public record PedidoDto(

        Integer pagamento,

        Integer presenca,

        Integer intermediador,

        String cnpjIntermediador,

        String idIntermediador,

        Integer modalidadeFrete,

        BigDecimal frete,

        BigDecimal desconto,

        BigDecimal despesasAcessorias,

        BigDecimal total,

        String informacoesFisco,

        String informacoesComplementares,

        String pedidoCompra,

        String contrato,

        String notaEmpenho,

        List<PagamentoDto> pagamentos

) implements SnakeCasesStrategy {
}