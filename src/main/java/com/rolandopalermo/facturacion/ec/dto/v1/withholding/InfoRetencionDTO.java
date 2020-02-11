package com.rolandopalermo.facturacion.ec.dto.v1.withholding;

import com.rolandopalermo.facturacion.ec.dto.v1.InfoComprobanteDTO;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class InfoRetencionDTO extends InfoComprobanteDTO {

    @NotEmpty
    private String tipoIdentificacionSujetoRetenido;
    @NotEmpty
    private String razonSocialSujetoRetenido;
    @NotEmpty
    private String identificacionSujetoRetenido;
    private String periodoFiscal;
    private String tipoSujetoRetenido;
    private String parteRel;

}