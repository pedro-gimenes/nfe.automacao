package com.automacao.nfe.globalException;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.automacao.nfe.exception.ValidacaoException;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class TratadorErros {
    
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<DadosErroValidacao> tratarErro404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> tratarErro400(MethodArgumentNotValidException ex){
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(DadosErroValidacao::new).toList());
    }

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity<DadosErroValidacao> tratarErroRegraDeNegocio(ValidacaoException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    private record DadosErroValidacao(String campo, String menssagem) {
        
        public DadosErroValidacao(FieldError error){
            this(error.getField(), error.getDefaultMessage());}
    }

}
