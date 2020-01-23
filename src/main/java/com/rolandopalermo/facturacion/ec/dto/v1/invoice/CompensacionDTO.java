package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class CompensacionDTO {

    @NotNull
    private String codigo;
    @NotNull
    private BigDecimal tarifa;
    @NotNull
    private BigDecimal valor;

}