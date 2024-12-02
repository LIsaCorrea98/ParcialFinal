package co.edu.ufps.DTO;
import jakarta.persistence.*;
import lombok.Data;
@Data
public class FacturaRequestDTO {
    private BigDecimal impuesto;
    private ClienteDTO cliente;
    private List<ProductoDTO> productos;
    private List<MedioPagoDTO> mediosPago;
    private VendedorDTO vendedor;
    private CajeroDTO cajero;
}
