package com.automacao.nfe.service.imposto;

import java.util.List;

import com.automacao.nfe.model.imposto.ImpostoNfeModel;

public interface ImpostoNfeService {

    ImpostoNfeModel salvar(
            ImpostoNfeModel model);

    List<ImpostoNfeModel> listar();

    void excluir(
            String referencia);

}