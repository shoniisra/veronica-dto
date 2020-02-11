package com.rolandopalermo.facturacion.ec.dto.v1.withholding;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RetencionDTO {

    private String codigo;
    private String codigoRetencion;
    private BigDecimal baseImponible;
    private BigDecimal porcentajeRetener;
    private BigDecimal valorRetenido;
    private DividendosDTO dividendos;
    private CompraCajBananoDTO compraCajBanano;

}