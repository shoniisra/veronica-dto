package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@ToString(exclude = "logo")
public class LogoDTO implements Serializable {

    @NotEmpty
    private byte[] logo;

}