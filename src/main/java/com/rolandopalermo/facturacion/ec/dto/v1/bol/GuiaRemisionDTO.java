package com.rolandopalermo.facturacion.ec.dto.v1.bol;

import com.rolandopalermo.facturacion.ec.dto.v1.ComprobanteDTO;
import lombok.Data;

import java.util.List;

@Data
public class GuiaRemisionDTO extends ComprobanteDTO {

    private InfoGuiaRemisionDTO infoGuiaRemisionDTO;
    private List<DestinatarioDTO> destinatario;

}