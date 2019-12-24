package com.rolandopalermo.facturacion.ec.dto.v1.cm;

import com.rolandopalermo.facturacion.ec.dto.v1.DetAdicionalDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ImpuestoDTO;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class NotaCreditoDetalleDTO implements Serializable {

    private String codigoInterno;
    private String codigoAdicional;
    private String descripcion;
    private BigDecimal cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal descuento;
    private BigDecimal precioTotalSinImpuesto;
    private List<DetAdicionalDTO> detAdicional;
    private List<ImpuestoDTO> impuesto;

}