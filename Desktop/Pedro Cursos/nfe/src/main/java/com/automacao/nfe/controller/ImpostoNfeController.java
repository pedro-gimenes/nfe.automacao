package com.automacao.nfe.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automacao.nfe.domain.imposto.ImpostoNfeRequestDto;
import com.automacao.nfe.domain.imposto.ImpostoNfeResponseDto;
import com.automacao.nfe.facade.imposto.ImpostoNfeFacade;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/nfe/classe-imposto")
@RequiredArgsConstructor
public class ImpostoNfeController {

    private final ImpostoNfeFacade facade;

    @PostMapping
    public ResponseEntity<ImpostoNfeResponseDto> salvar(@RequestBody ImpostoNfeRequestDto dto){

        return ResponseEntity.ok(facade.salvar(dto));

    }

    @GetMapping
    public ResponseEntity<
            List<ImpostoNfeResponseDto>>
    listar(){

        return ResponseEntity.ok(

                facade.listar()
        );

    }

    @DeleteMapping("/{referencia}")
    public ResponseEntity<Void> excluir(@PathVariable String referencia) {

        facade.excluir(referencia);
        
        return ResponseEntity
                .noContent()
                .build();

    }

}