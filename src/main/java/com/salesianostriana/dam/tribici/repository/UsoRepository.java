package com.salesianostriana.dam.tribici.repository;

import com.salesianostriana.dam.tribici.model.Uso;
import com.salesianostriana.dam.tribici.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsoRepository extends JpaRepository<Uso, Long> {


    @Query("select u from Uso u where u.usuario = ?1 order by u.fechaInicio DESC")
    Optional<Uso> findByUsuarioOrderByFechaInicioDesc(Usuario usuario);
}
