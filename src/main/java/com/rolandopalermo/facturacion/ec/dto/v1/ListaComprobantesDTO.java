package com.rolandopalermo.facturacion.ec.dto.v1;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class ListaComprobantesDTO implements Serializable {

    private List<String> comprobantes = new ArrayList<>();

}