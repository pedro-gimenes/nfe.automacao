package com.automacao.nfe.helper;

import org.springframework.stereotype.Component;

import com.automacao.nfe.exceptions.CancelamentoNfeException;
import com.automacao.nfe.model.emissao.EmissaoNfeModel;

@Component
public class CancelamentoNfeHelper {

    public void validarCancelamento(
            EmissaoNfeModel model) {

        if (model == null) {

            throw new CancelamentoNfeException(
                    "Nota fiscal não encontrada");

        }

        if ("CANCELADA".equals(model.getStatus())) {

            throw new CancelamentoNfeException(
                    "Nota fiscal já foi cancelada");

        }

        if (!"APROVADA".equals(model.getStatus())) {

            throw new CancelamentoNfeException(
                    "Somente notas aprovadas podem ser canceladas");

        }

    }

}