package com.rolandopalermo.facturacion.ec.dto.v1.pc;

import com.rolandopalermo.facturacion.ec.dto.v1.DetAdicionalDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ImpuestoDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class LiquidacionCompraDetalleDTO {

    protected String codigoPrincipal;
    protected String codigoAuxiliar;
    protected String descripcion;
    protected String unidadMedida;
    protected BigDecimal cantidad;
    protected BigDecimal precioUnitario;
    protected BigDecimal precioSinSubsidio;
    protected BigDecimal descuento;
    protected BigDecimal precioTotalSinImpuesto;
    private List<DetAdicionalDTO> detAdicional;
    private List<ImpuestoDTO> impuesto;

}