package com.automacao.nfe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automacao.nfe.domain.empresa.EmpresaNfeRequestDto;
import com.automacao.nfe.domain.empresa.EmpresaNfeResponseDto;
import com.automacao.nfe.facade.empresa.EmpresaNfeFacade;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/nfe/empresa")
@RequiredArgsConstructor
public class EmpresaNfeController {

    private final EmpresaNfeFacade facade;

    @PostMapping
    public ResponseEntity<EmpresaNfeResponseDto> salvar(

            @RequestBody
            EmpresaNfeRequestDto dto) {

        return ResponseEntity.ok(

                facade.salvar(dto)
        );
    }

}