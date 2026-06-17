package com.automacao.nfe.domain.cancelamento;

import com.automacao.nfe.utils.SnakeCasesStrategy;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CancelamentoNfeRequestDto(
        @NotBlank(message = "Justificativa obrigatória")
        @Size(min = 15, max = 255, message = "Justificativa deve possuir entre 15 e 255 caracteres")
        String justificativa) implements SnakeCasesStrategy {}
