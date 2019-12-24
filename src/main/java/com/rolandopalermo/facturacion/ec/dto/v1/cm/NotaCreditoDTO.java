package com.rolandopalermo.facturacion.ec.dto.v1.cm;

import com.rolandopalermo.facturacion.ec.dto.v1.ComprobanteDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class NotaCreditoDTO extends ComprobanteDTO {

    @Valid
    private InfoNotaCreditoDTO infoNotaCredito;
    @NotNull
    @Valid
    @Size(min = 1)
    private List<NotaCreditoDetalleDTO> detalle;

}