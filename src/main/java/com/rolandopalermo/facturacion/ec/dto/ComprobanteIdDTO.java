package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class ComprobanteIdDTO implements Serializable {

    @NonNull
    @NotEmpty
    @Size(min = 49, max = 49)
    private String claveAcceso;

}