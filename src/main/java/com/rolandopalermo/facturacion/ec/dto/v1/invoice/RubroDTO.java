package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RubroDTO {

    private String concepto;
    private BigDecimal total;

}