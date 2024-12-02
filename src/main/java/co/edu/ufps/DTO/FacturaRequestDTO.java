package co.edu.ufps.DTO;
import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
@Data
public class FacturaRequestDTO {
    private BigDecimal impuesto;
    private ClienteDTO cliente;
    private List<ProductoDTO> productos;
    private List<TipoPagoDTO> mediosPago;
    private VendedorDTO vendedor;
    private CajeroDTO cajero;
}
