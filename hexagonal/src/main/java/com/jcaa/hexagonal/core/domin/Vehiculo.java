package com.jcaa.hexagonal.core.domin;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Vehiculo  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String placa;

    private String marca;
    private String modelo;
    private String version;
    private String color;

    private int numPuestos;
    private int numPuertas;

    private String combustible;
    private int kilometros;
    private int cilindraje;
    private String categoria;

    @Column(name = "fecha_creacion", insertable = false, updatable = false)
    private java.sql.Timestamp fechaCreacion;
}
