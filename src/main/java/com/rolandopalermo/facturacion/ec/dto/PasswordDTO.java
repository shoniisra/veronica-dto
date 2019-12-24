package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class PasswordDTO implements Serializable {

    @NotEmpty
    @Size(max = 15)
    private String oldPassword;
    @NotEmpty
    @Size(max = 15)
    private String newPassword;

}