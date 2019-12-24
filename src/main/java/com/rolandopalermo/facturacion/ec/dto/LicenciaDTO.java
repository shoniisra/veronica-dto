package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class LicenciaDTO implements Serializable {

    @NotNull
    private String usuario;

    @NotNull
    private String numeroRuc;

    @NotNull
    private String fechaVencimiento;

}