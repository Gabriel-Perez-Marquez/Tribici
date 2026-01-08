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
    @JoinColumn(name = "bicicleta_id")
    private Estacion estacion;
    @ManyToOne
    @JoinColumn(name = "bicicleta_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "bicicleta_id")
    private Bicicleta bicicleta;

}
