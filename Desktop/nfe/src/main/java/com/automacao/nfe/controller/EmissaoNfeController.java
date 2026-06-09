package com.automacao.nfe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automacao.nfe.domain.emissao.EmissaoNfeRequestDto;
import com.automacao.nfe.domain.emissao.EmissaoNfeResponseDto;
import com.automacao.nfe.service.emissao.EmissaoNfeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/nfe")
@RequiredArgsConstructor
public class EmissaoNfeController {

    private final EmissaoNfeService emissaoNfeService;

    @PostMapping("/emissao")
    public ResponseEntity<EmissaoNfeResponseDto> emitir(@RequestBody EmissaoNfeRequestDto request) {

        return ResponseEntity.ok(
                emissaoNfeService.emitir(request)
        );
    }

}