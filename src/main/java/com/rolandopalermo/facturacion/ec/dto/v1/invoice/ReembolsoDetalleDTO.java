package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import lombok.Data;

import java.util.List;

@Data
public class ReembolsoDetalleDTO {

    private String tipoIdentificacionProveedorReembolso;
    private String identificacionProveedorReembolso;
    private String codPaisPagoProveedorReembolso;
    private String tipoProveedorReembolso;
    private String codDocReembolso;
    private String estabDocReembolso;
    private String ptoEmiDocReembolso;
    private String secuencialDocReembolso;
    private String fechaEmisionDocReembolso;
    private String numeroautorizacionDocReemb;
    private List<DetalleImpuestoDTO> detalleImpuesto;
    private List<CompensacionReembolsoDTO> compensacionReembolso;

}