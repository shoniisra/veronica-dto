package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import com.rolandopalermo.facturacion.ec.dto.v1.ComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ReembolsoDetalleDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class FacturaDTO extends ComprobanteDTO {

    @Valid
    private InfoFacturaDTO infoFactura;
    @NotNull
    @Valid
    @Size(min = 1)
    private List<FacturaDetalleDTO> detalle;
    private List<ReembolsoDetalleDTO> reembolsoDetalle;
    private List<FacturaRetencionDTO> retencion;
    private TipoNegociableDTO tipoNegociable;
    private InfoSustitutivaGuiaRemisionDTO infoSustitutivaGuiaRemision;
    private List<RubroDTO> rubro;

}