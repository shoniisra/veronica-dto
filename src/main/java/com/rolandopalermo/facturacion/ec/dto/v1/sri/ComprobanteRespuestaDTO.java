package com.rolandopalermo.facturacion.ec.dto.v1.sri;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ComprobanteRespuestaDTO implements Serializable {

    private String claveAcceso;
    private List<MensajeDTO> mensajes;

}