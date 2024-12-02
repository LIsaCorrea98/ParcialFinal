package co.edu.ufps.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cajero")
@Data
public class Cajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "identificacion", nullable = false, length = 50, unique = true)
    private String identificacion;

    @ManyToOne
    @JoinColumn(name = "tienda_id", nullable = false)
    private Tienda tienda;
}
