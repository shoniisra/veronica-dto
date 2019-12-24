package com.rolandopalermo.facturacion.ec.dto;

import com.rolandopalermo.facturacion.ec.common.types.EmailTypeEnum;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Data
public class PlantillaCorreoDTO implements Serializable {

    private EmailTypeEnum emailTypeEnum;
    @NotEmpty
    private String smtpHost;
    private int smtpSocketFactoryPort;
    @NotEmpty
    private String smtpSocketFactoryClass;
    private int smtpPort;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String password;
    private boolean smtpAuth;
    private boolean defaultAccount;
    private boolean smtStartTlsEnable;
    @NotEmpty
    private String plantillaHTML;
    @NotEmpty
    private String nombreEtiqueta;
    private List<MimeTypeDTO> mimetypes;

}