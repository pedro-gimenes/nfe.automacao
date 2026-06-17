package com.automacao.nfe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automacao.nfe.domain.relatorio.RelatorioNfeRequestDto;
import com.automacao.nfe.domain.relatorio.RelatorioNfeResponseDto;
import com.automacao.nfe.facade.relatorio.RelatorioNfeFacade;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/nfe/relatorios")
@RequiredArgsConstructor
public class RelatorioNfeController {

    private final RelatorioNfeFacade facade;

    @PostMapping
    public ResponseEntity<RelatorioNfeResponseDto>

    gerar(

            @RequestBody

            RelatorioNfeRequestDto dto){

        return ResponseEntity.ok(

                facade.gerar(dto));

    }

}
