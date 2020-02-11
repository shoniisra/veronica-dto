package com.rolandopalermo.facturacion.ec.dto.v1.withholding;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ImpuestoDocSustentoDTO {

    private String codImpuestoDocSustento;
    private String codigoPorcentaje;
    private BigDecimal baseImponible;
    private BigDecimal tarifa;
    private BigDecimal valorImpuesto;

}