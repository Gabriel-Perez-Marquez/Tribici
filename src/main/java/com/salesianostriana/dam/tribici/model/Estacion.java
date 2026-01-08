package com.salesianostriana.dam.tribici.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Estacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private String nombre;
    private String coordenadas;
    private int capacidad;
    @OneToMany(mappedBy = "estacion")
    private List<Bicicleta> bicicletas = new ArrayList<>();
    @OneToMany(mappedBy = "estacion")
    @Builder.Default
    private List<Uso> usos = new ArrayList<>();
}
