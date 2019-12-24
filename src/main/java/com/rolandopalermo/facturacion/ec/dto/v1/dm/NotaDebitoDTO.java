package com.rolandopalermo.facturacion.ec.dto.v1.dm;

import com.rolandopalermo.facturacion.ec.dto.v1.ComprobanteDTO;
import lombok.Data;

import java.util.List;

@Data
public class NotaDebitoDTO extends ComprobanteDTO {

    private InfoNotaDebitoDTO infoNotaDebito;
    private List<MotivoDTO> motivo;

}