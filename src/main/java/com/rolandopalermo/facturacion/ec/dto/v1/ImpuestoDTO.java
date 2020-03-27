package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ImpuestoDTO implements Serializable {

    private String codigo;
    private String codigoPorcentaje;
    private String codigoRetencion;
    private BigDecimal tarifa;
    private BigDecimal baseImponible;
    private BigDecimal porcentajeRetener;
    private BigDecimal valorRetenido;
    private String codDocSustento;
    private String numDocSustento;
    private String fechaEmisionDocSustento;
    private BigDecimal valor;

}