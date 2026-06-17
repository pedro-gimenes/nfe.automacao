package com.automacao.nfe.facade.emissao.impl;

import com.automacao.nfe.adapter.emissao.EmissaoNfeAdapter;
import com.automacao.nfe.domain.emissao.EmissaoNfeRequestDto;
import com.automacao.nfe.domain.emissao.ProdutoDto;
import com.automacao.nfe.exceptions.EmissaoNfeException;
import com.automacao.nfe.facade.emissao.EmissaoNfeFacade;
import com.automacao.nfe.helper.EmissaoNfeHelper;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;
import com.automacao.nfe.repository.EmissaoNfeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmissaoNfeFacadeImpl
        implements EmissaoNfeFacade {

    private final EmissaoNfeRepository repository;
    private final EmissaoNfeAdapter adapter;

    @Override
    public EmissaoNfeModel emitir(
            EmissaoNfeRequestDto request
    ) {

        validarOperacao(request);

        validarCliente(request);

        validarProdutos(request);

        validarPedido(request);

        validarDatas(request);

        validarPedidoDuplicado(request);

        EmissaoNfeModel entity =
                adapter.toEntity(request);

        entity.setStatus("PROCESSANDO");

        return repository.save(entity);
    }

    private void validarOperacao(
            EmissaoNfeRequestDto request
    ) {

        if (request.operacao() == null) {

            throw new EmissaoNfeException(
                    "Operação é obrigatória."
            );
        }

        if (request.operacao() != 0
                && request.operacao() != 1) {

            throw new EmissaoNfeException(
                    "Operação deve ser 0 (entrada) ou 1 (saída)."
            );
        }
    }

    private void validarCliente(
            EmissaoNfeRequestDto request
    ) {

        if (request.cliente() == null) {

            throw new EmissaoNfeException(
                    "Cliente é obrigatório."
            );
        }

        boolean possuiCpf =
                request.cliente().cpf() != null
                        && !request.cliente().cpf().isBlank();

        boolean possuiCnpj =
                request.cliente().cnpj() != null
                        && !request.cliente().cnpj().isBlank();

        if (!possuiCpf && !possuiCnpj) {

            throw new EmissaoNfeException(
                    "CPF ou CNPJ deve ser informado."
            );
        }
    }

    private void validarProdutos(
            EmissaoNfeRequestDto request
    ) {

        if (request.produtos() == null
                || request.produtos().isEmpty()) {

            throw new EmissaoNfeException(
                    "Ao menos um produto deve ser informado."
            );
        }

        for (ProdutoDto produto : request.produtos()) {

            if (produto.nome() == null
                    || produto.nome().isBlank()) {

                throw new EmissaoNfeException(
                        "Nome do produto é obrigatório."
                );
            }

            if (produto.codigo() == null
                    || produto.codigo().isBlank()) {

                throw new EmissaoNfeException(
                        "Código do produto é obrigatório."
                );
            }

            if (produto.quantidade() == null
                    || produto.quantidade().doubleValue() <= 0) {

                throw new EmissaoNfeException(
                        "Quantidade do produto inválida."
                );
            }

            if (produto.total() == null
                    || produto.total().doubleValue() <= 0) {

                throw new EmissaoNfeException(
                        "Valor total do produto inválido."
                );
            }
        }
    }

    private void validarPedido(
            EmissaoNfeRequestDto request
    ) {

        if (request.pedido() == null) {

            throw new EmissaoNfeException(
                    "Pedido é obrigatório."
            );
        }

        if (request.pedido().pagamentos() == null
                || request.pedido().pagamentos().isEmpty()) {

            throw new EmissaoNfeException(
                    "Forma de pagamento obrigatória."
            );
        }
    }

    private void validarDatas(
            EmissaoNfeRequestDto request
    ) {

        EmissaoNfeHelper.validarDataEmissao(
                request.dataEmissao()
        );

        EmissaoNfeHelper.validarDataEntradaSaida(
                request.dataEntradaSaida()
        );
    }

    private void validarPedidoDuplicado(
            EmissaoNfeRequestDto request
    ) {

        if (request.id() == null
                || request.id().isBlank()) {

            return;
        }

        repository.findByPedidoId(
                request.id()
        ).ifPresent(entity -> {

            throw new EmissaoNfeException(
                    "Já existe uma NF-e para o pedido "
                            + request.id()
            );

        });
    }
}