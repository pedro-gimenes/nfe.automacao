package com.automacao.nfe.model.notificacao;

import lombok.Data;

@Data
public class NotificacaoRequest {
    private String uuid;
    private String status;
    private String motivo;
    private Integer nfe;
    private Integer serie;
    private String recibo;
    private String chave;
    private String modelo;
    private Boolean epec;
    private String xml;
    private String danfe;
    private Object log;
    private Object data;
    private Object log_cancelamento;
}
