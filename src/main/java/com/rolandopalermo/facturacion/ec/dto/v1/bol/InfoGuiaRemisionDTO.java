package com.rolandopalermo.facturacion.ec.dto.v1.bol;

import lombok.Data;

import java.io.Serializable;

@Data
public class InfoGuiaRemisionDTO implements Serializable {

    private String dirEstablecimiento;
    private String dirPartida;
    private String razonSocialTransportista;
    private String tipoIdentificacionTransportista;
    private String rucTransportista;
    private String rise;
    private String obligadoContabilidad;
    private String contribuyenteEspecial;
    private String fechaIniTransporte;
    private String fechaFinTransporte;
    private String placa;

}