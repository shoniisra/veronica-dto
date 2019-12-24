package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class TipoDocumentoDTO implements Serializable {

    @NotEmpty
    @Size(max = 3)
    private String codigo;
    @NotEmpty
    @Size(max = 80)
    private String descripcion;

}