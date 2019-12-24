package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class EmailDTO implements Serializable {

    @NonNull
    @NotEmpty
    @Email
    private String email;

}
