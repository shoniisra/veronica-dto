package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import com.rolandopalermo.facturacion.ec.dto.v1.InfoComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.PagoDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.TotalImpuestoDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
public class InfoFacturaDTO extends InfoComprobanteDTO {

    private String comercioExterior;
    private String incoTermFactura;
    private String lugarIncoTerm;
    private String paisOrigen;
    private String puertoEmbarque;
    private String puertoDestino;
    private String paisDestino;
    private String paisAdquisicion;

    private BigDecimal totalSubsidio;
    private String incoTermTotalSinImpuestos;
    private String codDocReembolso;
    private BigDecimal totalComprobantesReembolso;
    private BigDecimal totalBaseImponibleReembolso;
    private BigDecimal totalImpuestoReembolso;

    private BigDecimal fleteInternacional;
    private BigDecimal seguroInternacional;
    private BigDecimal gastosAduaneros;
    private BigDecimal gastosTransporteOtros;

    @NotEmpty
    private String tipoIdentificacionComprador;
    private String guiaRemision;
    @NotEmpty
    private String razonSocialComprador;
    @NotEmpty
    private String identificacionComprador;
    private String direccionComprador;
    @NotNull
    private BigDecimal totalSinImpuestos;
    private BigDecimal totalDescuento;
    @NotEmpty
    @Valid
    private List<TotalImpuestoDTO> totalImpuesto;
    @Valid
    private List<CompensacionDTO> compensacion;
    private BigDecimal propina;
    @NotNull
    private BigDecimal importeTotal;
    private String moneda;
    @NotEmpty
    @Valid
    private List<PagoDTO> pagos;
    private BigDecimal valorRetIva;
    private BigDecimal valorRetRenta;

}