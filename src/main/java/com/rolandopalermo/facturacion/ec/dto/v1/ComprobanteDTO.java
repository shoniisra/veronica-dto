package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
public class ComprobanteDTO implements Serializable {

    @NotEmpty
    private String id;
    @NotEmpty
    private String version;
    @NotNull
    @Valid
    private InfoTributariaDTO infoTributaria;
    @Valid
    private List<CampoAdicionalDTO> campoAdicional;

}