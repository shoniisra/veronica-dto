package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class CampoAdicionalDTO implements Serializable {

    @NotEmpty
    private String value;
    @NotEmpty
    private String nombre;

}