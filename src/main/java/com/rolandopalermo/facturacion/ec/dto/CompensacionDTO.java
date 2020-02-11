package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Data
public class CompensacionDTO {

    @NotEmpty
    private String codigo;
    @NotEmpty
    private BigDecimal tarifa;
    @NotEmpty
    private BigDecimal valor;

}