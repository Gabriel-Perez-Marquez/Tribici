package com.salesianostriana.dam.tribici.service;

import com.salesianostriana.dam.tribici.model.Bicicleta;
import com.salesianostriana.dam.tribici.model.Estacion;
import com.salesianostriana.dam.tribici.repository.EstacionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstacionService {


    private final EstacionRepository estacionRepository;

    public List<Estacion> getAll(){
        return estacionRepository.findAll();
    }

    public Estacion getById(Long id){
        return estacionRepository.findById(id).orElseThrow(() -> new RuntimeException("Estación no encontrada"));
    }

    public Estacion save(Estacion e){
        return estacionRepository.save(e);
    }

    public Estacion edit(Estacion e, Long id){
        Estacion eAtnigua = estacionRepository.findById(id).orElseThrow(() -> new RuntimeException("Estación no encontrada"));

        eAtnigua.setNombre(e.getNombre());
        eAtnigua.setNumero(e.getNumero());
        eAtnigua.setCoordenadas(e.getCoordenadas());
        eAtnigua.setCapacidad(e.getCapacidad());
        eAtnigua.setBicicletas(e.getBicicletas());

        return estacionRepository.save(eAtnigua);
    }

    public void delete(Long id){
        Estacion e = estacionRepository.findById(id).orElseThrow(() -> new RuntimeException("Estación no encontrada"));
        estacionRepository.delete(e);
    }




}
