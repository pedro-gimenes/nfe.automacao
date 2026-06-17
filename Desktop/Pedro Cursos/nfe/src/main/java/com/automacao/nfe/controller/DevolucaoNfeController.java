package com.automacao.nfe.controller;

import com.automacao.nfe.domain.devolucao.DevolucaoNfeRequestDto;
import com.automacao.nfe.domain.devolucao.DevolucaoNfeResponseDto;
import com.automacao.nfe.facade.devolucao.DevolucaoNfeFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nfe/devolucao")
@RequiredArgsConstructor
public class DevolucaoNfeController {

    private final DevolucaoNfeFacade facade;

    @PostMapping
    public ResponseEntity<DevolucaoNfeResponseDto> emitirDevolucao(
            @RequestBody DevolucaoNfeRequestDto dto) {

        return ResponseEntity.ok(facade.emitir(dto));
    }

}