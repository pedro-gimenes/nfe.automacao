package com.automacao.nfe.globalException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.automacao.nfe.domain.ApiErrorDto;
import com.automacao.nfe.exceptions.BusinessException;
import com.automacao.nfe.exceptions.CancelamentoNfeException;
import com.automacao.nfe.exceptions.ConsultaNfeException;
import com.automacao.nfe.exceptions.EmissaoNfeException;

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
                                LocalDateTime.now(),
                                400,
                                ex.getMessage()
                        )
                );
    }

    @ExceptionHandler(CancelamentoNfeException.class)
    public ResponseEntity<Object> handleCancelamentoNfeException(CancelamentoNfeException ex) {

       return ResponseEntity
               .badRequest()
               .body(ex.getMessage());

   }

   @ExceptionHandler(ConsultaNfeException.class)
        public ResponseEntity<Object> handleConsultaNfeException(ConsultaNfeException ex) {

           return ResponseEntity
                   .badRequest()
                   .body(ex.getMessage());

        }

    
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ApiErrorDto> handleBusinessException(
            BusinessException ex) {

        ApiErrorDto error = new ApiErrorDto(
                        LocalDateTime.now(),                      
                        HttpStatus.BAD_REQUEST.value(),
                        ex.getMessage()

                );

        return ResponseEntity.badRequest().body(error);

    }


}