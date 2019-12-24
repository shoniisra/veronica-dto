package com.rolandopalermo.facturacion.ec.dto.v1.withholding;

import com.rolandopalermo.facturacion.ec.dto.v1.ComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ImpuestoDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class RetencionDTO extends ComprobanteDTO {

    private InfoRetencionDTO infoRetencion;
    @NotNull
    @Valid
    @Size(min = 1)
    private List<ImpuestoDTO> impuesto;

}