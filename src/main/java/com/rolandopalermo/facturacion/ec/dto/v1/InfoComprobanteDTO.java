package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class InfoComprobanteDTO implements Serializable {

    @NotEmpty
    private String fechaEmision;
    @NotEmpty
    private String dirEstablecimiento;
    private String contribuyenteEspecial;
    private String obligadoContabilidad;

}