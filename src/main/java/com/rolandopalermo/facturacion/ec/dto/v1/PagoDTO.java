package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PagoDTO implements Serializable {

    private String formaPago;
    private BigDecimal total;
    private String plazo;
    private String unidadTiempo;

}