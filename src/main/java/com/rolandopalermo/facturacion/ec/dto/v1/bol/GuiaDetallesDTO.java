package com.rolandopalermo.facturacion.ec.dto.v1.bol;

import com.rolandopalermo.facturacion.ec.dto.v1.DetAdicionalDTO;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class GuiaDetallesDTO implements Serializable {

    private String codigoInterno;
    private String codigoAdicional;
    private String descripcion;
    private BigDecimal cantidad;
    private List<DetAdicionalDTO> detAdicional;

}