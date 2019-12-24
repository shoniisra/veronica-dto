package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class CertificadoDigitalDTO implements Serializable {

    @NotEmpty
    @Size(max = 15)
    private String password;

    @NotNull
    private byte[] certificado;

}