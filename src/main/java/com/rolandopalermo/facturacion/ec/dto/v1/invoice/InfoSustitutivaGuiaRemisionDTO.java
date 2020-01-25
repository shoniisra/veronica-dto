package com.rolandopalermo.facturacion.ec.dto.v1.invoice;

import lombok.Data;

import java.util.List;

@Data
public class InfoSustitutivaGuiaRemisionDTO {

    private String dirPartida;
    private String dirDestinatario;
    private String fechaIniTransporte;
    private String fechaFinTransporte;
    private String razonSocialTransportista;
    private String tipoIdentificacionTransportista;
    private String rucTransportista;
    private String placa;
    private List<DestinoDTO> destino;

}