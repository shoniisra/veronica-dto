package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class DetAdicionalDTO implements Serializable {

    @NotEmpty
    private String nombre;
    @NotEmpty
    private String valor;

}