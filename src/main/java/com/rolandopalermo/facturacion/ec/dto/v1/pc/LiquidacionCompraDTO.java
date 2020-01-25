package com.rolandopalermo.facturacion.ec.dto.v1.pc;

import com.rolandopalermo.facturacion.ec.dto.v1.ComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.invoice.ReembolsoDetalleDTO;
import lombok.Data;

import java.util.List;

@Data
public class LiquidacionCompraDTO extends ComprobanteDTO {

    protected InfoLiquidacionCompraDTO infoLiquidacionCompra;
    private List<LiquidacionCompraDetalleDTO> detalle;
    private List<ReembolsoDetalleDTO> reembolsoDetalle;
    private MaquinaFiscalDTO maquinaFiscal;

}