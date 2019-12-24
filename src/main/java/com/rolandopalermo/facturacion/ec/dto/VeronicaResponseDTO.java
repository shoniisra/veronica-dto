package com.rolandopalermo.facturacion.ec.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class VeronicaResponseDTO<T> implements Serializable {

    private boolean success;
    @NotNull
    private T result;

}