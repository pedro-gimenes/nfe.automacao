package com.automacao.nfe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.automacao.nfe.domain.cancelamento.CancelamentoNfeRequestDto;
import com.automacao.nfe.domain.cancelamento.CancelamentoNfeResponseDto;
import com.automacao.nfe.facade.cancelamento.CancelamentoNfeFacade;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/nfe/cancelar")
@RequiredArgsConstructor
@Validated
public class CancelamentoNfeController {

    private final CancelamentoNfeFacade facade;

    @PutMapping("/{uuid}")
    public ResponseEntity<CancelamentoNfeResponseDto> cancelar(@PathVariable String uuid, @Valid @RequestBody CancelamentoNfeRequestDto dto) {

        return ResponseEntity.ok(

                facade.cancelar(uuid, dto)

        );

    }

}