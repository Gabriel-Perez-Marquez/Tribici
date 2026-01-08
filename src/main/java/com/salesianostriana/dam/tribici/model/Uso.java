package com.salesianostriana.dam.tribici.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
@Builder
public class Uso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double coste;
    @ManyToOne
    private Estacion estacion;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    @JoinColumn
    private Bicicleta bicicleta;

}
