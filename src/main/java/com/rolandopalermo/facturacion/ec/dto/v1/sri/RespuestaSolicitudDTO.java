package com.rolandopalermo.facturacion.ec.dto.v1.sri;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RespuestaSolicitudDTO implements Serializable {

    private String estado;
    private List<ComprobanteRespuestaDTO> comprobantes;

}