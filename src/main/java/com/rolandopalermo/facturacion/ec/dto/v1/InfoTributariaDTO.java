package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class InfoTributariaDTO implements Serializable {

    @NotEmpty
    private String ambiente;
    @NotEmpty
    private String tipoEmision;
    @NotEmpty
    private String razonSocial;
    private String nombreComercial;
    @NotEmpty
    private String ruc;
    @NotEmpty
    private String codDoc;
    @NotEmpty
    private String estab;
    @NotEmpty
    private String ptoEmi;
    @NotEmpty
    private String secuencial;
    @NotEmpty
    private String dirMatriz;

}