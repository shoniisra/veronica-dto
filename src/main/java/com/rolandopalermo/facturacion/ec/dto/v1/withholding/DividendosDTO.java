package com.rolandopalermo.facturacion.ec.dto.v1.withholding;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DividendosDTO {

    private String fechaPagoDiv;
    private BigDecimal imRentaSoc;
    private String ejerFisUtDiv;

}