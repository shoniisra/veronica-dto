package com.rolandopalermo.facturacion.ec.dto.v1.pc;

import com.rolandopalermo.facturacion.ec.dto.v1.PagoDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.TotalImpuestoDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class InfoLiquidacionCompraDTO {

    protected String fechaEmision;
    protected String dirEstablecimiento;
    protected String contribuyenteEspecial;
    protected String obligadoContabilidad;
    protected String tipoIdentificacionProveedor;
    protected String razonSocialProveedor;
    protected String identificacionProveedor;
    protected String direccionProveedor;
    protected BigDecimal totalSinImpuestos;
    protected BigDecimal totalDescuento;
    protected String codDocReembolso;
    protected BigDecimal totalComprobantesReembolso;
    protected BigDecimal totalBaseImponibleReembolso;
    protected BigDecimal totalImpuestoReembolso;
    private List<TotalImpuestoDTO> totalImpuesto;
    protected BigDecimal importeTotal;
    protected String moneda;
    private List<PagoDTO> pago;

}