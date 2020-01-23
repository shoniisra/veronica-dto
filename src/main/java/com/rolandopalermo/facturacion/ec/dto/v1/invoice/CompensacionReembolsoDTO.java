package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CompensacionReembolsoDTO {

    private String codigo;
    private BigDecimal tarifa;
    private BigDecimal valor;

}