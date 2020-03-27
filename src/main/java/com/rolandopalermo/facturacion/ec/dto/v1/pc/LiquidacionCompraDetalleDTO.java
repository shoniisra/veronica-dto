package com.rolandopalermo.facturacion.ec.dto.v1.pc;

import com.rolandopalermo.facturacion.ec.dto.v1.DetAdicionalDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ImpuestoDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class LiquidacionCompraDetalleDTO implements Serializable {

    @NotEmpty
    protected String codigoPrincipal;
    protected String codigoAuxiliar;
    @NotEmpty
    protected String descripcion;
    protected String unidadMedida;
    //@NotNull
    protected BigDecimal cantidad;
    //@NotNull
    protected BigDecimal precioUnitario;
    //eliminar este campo
    protected BigDecimal precioSinSubsidio;
    protected BigDecimal descuento;
     //@NotNull
    protected BigDecimal precioTotalSinImpuesto;
    private List<DetAdicionalDTO> detAdicional;
    @NotEmpty
    @Valid
    private List<ImpuestoDTO> impuesto;

}