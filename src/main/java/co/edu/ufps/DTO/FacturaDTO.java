package co.edu.ufps.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO {

    private Integer id;
    private Integer clienteId;
    private LocalDateTime fechaEmision;
    private BigDecimal total;
    private Integer estadoId;  // Relación con estado de la factura
}

