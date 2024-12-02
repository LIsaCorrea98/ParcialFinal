package co.edu.ufps.Entities;


import lombok.Data;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "producto")
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "precio", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(name = "descripcion", length = 255)
    private String descripcion;
}


