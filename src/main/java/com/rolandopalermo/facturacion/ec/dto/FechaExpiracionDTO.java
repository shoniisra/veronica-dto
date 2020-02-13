package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class FechaExpiracionDTO {

    @NotNull
    private String nuevoFechaExpiracion;

}
