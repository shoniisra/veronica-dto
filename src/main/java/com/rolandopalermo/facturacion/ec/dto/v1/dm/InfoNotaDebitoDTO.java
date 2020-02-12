package com.rolandopalermo.facturacion.ec.dto.v1.dm;

import com.rolandopalermo.facturacion.ec.dto.CompensacionDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ImpuestoDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.InfoComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.PagoDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@Data
public class InfoNotaDebitoDTO extends InfoComprobanteDTO {

    private String tipoIdentificacionComprador;
    private String razonSocialComprador;
    private String identificacionComprador;
    private String codDocModificado;
    private String numDocModificado;
    private String fechaEmisionDocSustento;
    private String rise;
    private BigDecimal totalSinImpuestos;
    protected BigDecimal valorTotal;
    @NotNull
    @Valid
    @Size(min = 1)
    private List<ImpuestoDTO> impuesto;
    @NotEmpty
    @Valid
    private List<PagoDTO> pagos;
    @Valid
    private List<CompensacionDTO> compensacion;

}