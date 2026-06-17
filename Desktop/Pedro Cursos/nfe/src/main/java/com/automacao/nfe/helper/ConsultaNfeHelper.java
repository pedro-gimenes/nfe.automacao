package com.automacao.nfe.helper;

import org.springframework.stereotype.Component;

import com.automacao.nfe.exceptions.ConsultaNfeException;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;

@Component
public class ConsultaNfeHelper {

    public void validarConsulta(
            EmissaoNfeModel model) {

        if (model == null) {

            throw new ConsultaNfeException(
                    "Nota fiscal não encontrada");

        }

    }

}