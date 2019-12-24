package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@ToString(exclude = "logo")
public class EmpresaDTO implements Serializable {

    @NotEmpty
    @Size(min = 9, max = 13)
    private String rucPropietario;

    @NotEmpty
    @Size(max = 300)
    private String razonSocial;

    @NotNull
    private byte[] logo;

}