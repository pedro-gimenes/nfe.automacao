package com.automacao.nfe.globalException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.automacao.nfe.domain.ApiErrorDto;
import com.automacao.nfe.exception.EmissaoNfeException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            EmissaoNfeException.class
    )
    public ResponseEntity<ApiErrorDto> handle(
            EmissaoNfeException ex
    ) {

        return ResponseEntity
                .badRequest()
                .body(
                        new ApiErrorDto(
                                400,
                                ex.getMessage()
                        )
                );
    }

}