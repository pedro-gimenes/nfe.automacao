package com.automacao.nfe.service.cancelamento;

import com.automacao.nfe.model.emissao.EmissaoNfeModel;

public interface CancelamentoNfeService {
    
    EmissaoNfeModel buscarPorUuid(String uuid);

    EmissaoNfeModel salvar(EmissaoNfeModel model);     
}
