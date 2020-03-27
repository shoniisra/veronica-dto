package com.rolandopalermo.facturacion.ec.dto.v1.pc;

import com.rolandopalermo.facturacion.ec.dto.v1.InfoComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.TotalImpuestoDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.PagoDTO;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
public class InfoLiquidacionCompraDTO extends InfoComprobanteDTO {

    protected String tipoIdentificacionProveedor;
    @NotEmpty
    protected String razonSocialProveedor;
    @NotEmpty
    protected String identificacionProveedor;
    protected String direccionProveedor;
    @NotNull
    protected BigDecimal totalSinImpuestos;
    @NotNull
    protected BigDecimal totalDescuento;
    protected String codDocReembolso;
    protected BigDecimal totalComprobantesReembolso;
    protected BigDecimal totalBaseImponibleReembolso;
    protected BigDecimal totalImpuestoReembolso;
    @NotEmpty
    @Valid
    private List<TotalImpuestoDTO> totalImpuesto;
    @NotNull
    protected BigDecimal importeTotal;
    protected String moneda;
    @NotEmpty
    @Valid
    private List<PagoDTO> pago;

}