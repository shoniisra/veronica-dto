package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Data
public class ReceptoresNotificacionDTO implements Serializable {

    @NotNull
    @Valid
    @Size(min = 1)
    private List<EmailDTO> emails;

}