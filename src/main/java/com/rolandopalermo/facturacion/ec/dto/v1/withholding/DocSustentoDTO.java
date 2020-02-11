package com.rolandopalermo.facturacion.ec.dto.v1.withholding;

import com.rolandopalermo.facturacion.ec.dto.v1.PagoDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ReembolsoDetalleDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class DocSustentoDTO {

    private String codSustento;
    private String codDocSustento;
    private String numDocSustento;
    private String fechaEmisionDocSustento;
    private String fechaRegistroContable;
    private String numAutDocSustento;
    private String pagoLocExt;
    private String tipoRegi;
    private String paisEfecPago;
    private String aplicConvDobTrib;
    private String pagExtSujRetNorLeg;
    private String pagoRegFis;
    private BigDecimal totalComprobantesReembolso;
    private BigDecimal totalBaseImponibleReembolso;
    private BigDecimal totalImpuestoReembolso;
    private BigDecimal totalSinImpuestos;
    private BigDecimal importeTotal;
    private List<ImpuestoDocSustentoDTO> impuestoDocSustento;
    private List<RetencionDTO> retencion;
    private List<ReembolsoDetalleDTO> reembolsoDetalle;
    private List<PagoDTO> pago;

}