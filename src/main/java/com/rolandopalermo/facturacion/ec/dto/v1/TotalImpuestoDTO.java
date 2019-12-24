package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class TotalImpuestoDTO implements Serializable {

    @NotEmpty
    private String codigo;
    @NotEmpty
    private String codigoPorcentaje;
    private BigDecimal descuentoAdicional;
    @NotNull
    private BigDecimal baseImponible;
    private BigDecimal tarifa;
    @NotNull
    private BigDecimal valor;

}