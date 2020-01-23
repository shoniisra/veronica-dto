package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import com.rolandopalermo.facturacion.ec.dto.v1.DetAdicionalDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ImpuestoDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class FacturaDetalleDTO implements Serializable {

    private String codigoPrincipal;
    private String codigoAuxiliar;
    @NotEmpty
    private String descripcion;
    private BigDecimal cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal descuento;
    private BigDecimal precioTotalSinImpuesto;
    private List<DetAdicionalDTO> detAdicional;
    @NotEmpty
    @Valid
    private List<ImpuestoDTO> impuesto;
    private String unidadMedida;

}