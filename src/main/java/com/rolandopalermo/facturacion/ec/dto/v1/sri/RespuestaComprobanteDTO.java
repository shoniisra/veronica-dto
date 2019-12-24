package com.rolandopalermo.facturacion.ec.dto.v1.sri;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString(exclude = "contentAsXML")
public class RespuestaComprobanteDTO implements Serializable {

    private Long timestamp;
    private String claveAccesoConsultada;
    private String numeroComprobantes;
    @JsonIgnore
    private String contentAsXML;
    private List<AutorizacionDTO> autorizaciones;

}