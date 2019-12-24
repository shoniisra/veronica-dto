package com.rolandopalermo.facturacion.ec.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@ToString(exclude = "password")
public class UsuarioDTO implements Serializable {

    @NotEmpty
    @Size(min = 6, max = 20)
    private String username;
    @NotEmpty
    @Size(min = 6, max = 15)
    private String password;
    @Email
    private String email;
    private boolean active;

}