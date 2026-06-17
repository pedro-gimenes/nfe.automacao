package com.automacao.nfe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.automacao.nfe.domain.consulta.ConsultaNfeResponseDto;
import com.automacao.nfe.facade.consulta.ConsultaNfeFacade;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/nfe/consulta")
@RequiredArgsConstructor
@Validated
public class ConsultaNfeController {

    private final ConsultaNfeFacade facade;

    @GetMapping("/{uuid}")
    public ResponseEntity<ConsultaNfeResponseDto> consultar(

            @PathVariable
            String uuid) {

        return ResponseEntity.ok(

                facade.consultar(uuid)

        );

    }

}