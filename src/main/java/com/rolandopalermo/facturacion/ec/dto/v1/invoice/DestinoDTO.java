package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import lombok.Data;

@Data
public class DestinoDTO {

    private String motivoTraslado;
    private String docAduaneroUnico;
    private String codEstabDestino;
    private String ruta;

}