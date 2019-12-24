package com.rolandopalermo.facturacion.ec.dto;

import com.rolandopalermo.facturacion.ec.dto.v1.sri.MensajeDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ConsultaComprobanteDTO implements Serializable {

    private String versionSri;
    private String tipoDocumento;
    private String estatusInterno;
    private String fechaAutorizacion;
    private List<MensajeDTO> mensajesSri;

}