package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FacturaRetencionDTO {

    private String codigo;
    private String codigoPorcentaje;
    private BigDecimal tarifa;
    private BigDecimal valor;

}
