package com.automacao.nfe.service.consulta;

import com.automacao.nfe.model.emissao.EmissaoNfeModel;

public interface ConsultaNfeService {

    EmissaoNfeModel buscarPorUuid(String uuid);

}