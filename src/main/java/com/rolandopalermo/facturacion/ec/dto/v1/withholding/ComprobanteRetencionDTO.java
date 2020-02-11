package com.rolandopalermo.facturacion.ec.dto.v1.withholding;

import com.rolandopalermo.facturacion.ec.dto.v1.ComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ImpuestoDTO;
import lombok.Data;

import java.util.List;

@Data
public class ComprobanteRetencionDTO extends ComprobanteDTO {

    private InfoRetencionDTO infoRetencion;
    private List<DocSustentoDTO> docSustento;
    private List<ImpuestoDTO> impuesto;

}