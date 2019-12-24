package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class ArchivoDTO implements Serializable {

    @NotEmpty
    private byte[] contenido;

}