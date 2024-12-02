package co.edu.ufps.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

    private Integer id;
    private String nombre;
    private BigDecimal precio;
    private Integer stock;
}

