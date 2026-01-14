package com.salesianostriana.dam.tribici.service;

import com.salesianostriana.dam.tribici.model.Bicicleta;
import com.salesianostriana.dam.tribici.repository.BicicletaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BicicletaService {

    private final BicicletaRepository bicicletaRepository;

    public List<Bicicleta> getAll(){
        return bicicletaRepository.findAll();
    }

    public Bicicleta getById(Long id){
        return bicicletaRepository.findById(id).orElseThrow(() -> new RuntimeException("Bicicleta no encontrada"));
    }

    public Bicicleta save(Bicicleta bicicleta){
        return bicicletaRepository.save(bicicleta);
    }

    public Bicicleta edit(Bicicleta bicicleta, Long id){
        Bicicleta b = bicicletaRepository.findById(id).orElseThrow(() -> new RuntimeException("Bicicleta no encontrada"));

        b.setMarca(bicicleta.getMarca());
        b.setModelo(bicicleta.getModelo());
        b.setEstado(bicicleta.getEstado());
        b.setEstacion(bicicleta.getEstacion());
        b.setUsos(bicicleta.getUsos());

        return bicicletaRepository.save(b);
    }

    public void delete(Long id){
        Bicicleta b = bicicletaRepository.findById(id).orElseThrow(() -> new RuntimeException("Bicicleta no encontrada"));

        bicicletaRepository.delete(b);
    }

}
