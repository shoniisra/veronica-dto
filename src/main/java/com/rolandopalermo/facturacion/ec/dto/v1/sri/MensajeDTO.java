package com.rolandopalermo.facturacion.ec.dto.v1.sri;

import lombok.Data;

import java.io.Serializable;

@Data
public class MensajeDTO implements Serializable {

    private String identificador;
    private String mensaje;
    private String informacionAdicional;
    private String tipo;

}