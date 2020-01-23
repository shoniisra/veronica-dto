package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DetalleImpuestoDTO {

    private String codigo;
    private String codigoPorcentaje;
    private BigDecimal tarifa;
    private BigDecimal baseImponibleReembolso;
    private BigDecimal impuestoReembolso;

}