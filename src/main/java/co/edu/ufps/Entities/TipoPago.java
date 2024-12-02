package co.edu.ufps.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_pago")
@Data
public class TipoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
}

