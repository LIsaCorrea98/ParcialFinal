package co.edu.ufps.DTO;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@Data
public class FacturaDataDTO {
    private String numero;
    private BigDecimal total;
    private LocalDate fecha;
}