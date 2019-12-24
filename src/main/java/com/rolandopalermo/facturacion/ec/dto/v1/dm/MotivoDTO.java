package com.rolandopalermo.facturacion.ec.dto.v1.dm;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MotivoDTO implements Serializable {

    @NotEmpty
    private String razon;
    @NotNull
    private BigDecimal valor;

}