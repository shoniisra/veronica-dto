package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MimeTypeDTO implements Serializable {

    private String idContenido;
    private byte[] contenido;
    private String tipo;

}