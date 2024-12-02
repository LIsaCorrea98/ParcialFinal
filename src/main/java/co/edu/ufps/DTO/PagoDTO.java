package co.edu.ufps.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoDTO {

    private Integer id;
    private Integer facturaId;  // Relación con factura
    private BigDecimal monto;
    private LocalDateTime fechaPago;
    private Integer tipoPagoId;  // Relación con tipo de pago
}

