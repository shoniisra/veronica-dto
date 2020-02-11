package com.rolandopalermo.facturacion.ec.dto.v1.withholding;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CompraCajBananoDTO {

    private String numCajBan;
    private BigDecimal precCajBan;

}