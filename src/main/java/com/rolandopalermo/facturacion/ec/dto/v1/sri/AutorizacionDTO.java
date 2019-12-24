package com.rolandopalermo.facturacion.ec.dto.v1.sri;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString(exclude = "comprobante")
public class AutorizacionDTO implements Serializable {

    private String estado;
    private String numeroAutorizacion;
    private String fechaAutorizacion;
    private String ambiente;
    @JsonIgnore
    private String comprobante;
    private List<MensajeDTO> mensajes;

}