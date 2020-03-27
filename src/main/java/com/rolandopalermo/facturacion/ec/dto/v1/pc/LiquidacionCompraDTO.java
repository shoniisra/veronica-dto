package com.rolandopalermo.facturacion.ec.dto.v1.pc;

import com.rolandopalermo.facturacion.ec.dto.v1.ComprobanteDTO;
import com.rolandopalermo.facturacion.ec.dto.v1.ReembolsoDetalleDTO;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class LiquidacionCompraDTO extends ComprobanteDTO {

    @Valid
    protected InfoLiquidacionCompraDTO infoLiquidacionCompra;
    @NotNull
    @Valid
    @Size(min = 1)
    private List<LiquidacionCompraDetalleDTO> detalle;
    private List<ReembolsoDetalleDTO> reembolsoDetalle;
    private MaquinaFiscalDTO maquinaFiscal;

}