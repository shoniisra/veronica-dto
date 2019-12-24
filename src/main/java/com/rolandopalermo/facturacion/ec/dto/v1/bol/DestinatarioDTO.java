package com.rolandopalermo.facturacion.ec.dto.v1.bol;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DestinatarioDTO implements Serializable {

    private String identificacionDestinatario;
    private String razonSocialDestinatario;
    private String dirDestinatario;
    private String motivoTraslado;
    private String docAduaneroUnico;
    private String codEstabDestino;
    private String ruta;
    private String codDocSustento;
    private String numDocSustento;
    private String numAutDocSustento;
    private String fechaEmisionDocSustento;
    private List<GuiaDetallesDTO> detalle;

}