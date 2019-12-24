package com.rolandopalermo.facturacion.ec.dto.v1.cm;

import com.rolandopalermo.facturacion.ec.dto.v1.InfoComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.TotalImpuestoDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@Data
public class InfoNotaCreditoDTO extends InfoComprobanteDTO {

    private String tipoIdentificacionComprador;
    private String razonSocialComprador;
    private String identificacionComprador;
    private String rise;
    private String codDocModificado;
    private String numDocModificado;
    private String fechaEmisionDocSustento;
    private BigDecimal totalSinImpuestos;
    private BigDecimal valorModificacion;
    private String moneda;
    private String motivo;
    @NotNull
    @Valid
    @Size(min = 1)
    private List<TotalImpuestoDTO> totalImpuesto;

}