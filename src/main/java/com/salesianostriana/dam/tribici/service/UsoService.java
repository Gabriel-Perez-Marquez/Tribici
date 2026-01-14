package com.salesianostriana.dam.tribici.service;

import com.salesianostriana.dam.tribici.model.Bicicleta;
import com.salesianostriana.dam.tribici.model.Estacion;
import com.salesianostriana.dam.tribici.model.Uso;
import com.salesianostriana.dam.tribici.model.Usuario;
import com.salesianostriana.dam.tribici.repository.UsoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsoService {
    private static double UMBRAL_SALDO_MINIMO;
    private final UsoRepository usoRepository;
    private final UsuarioService  usuarioService;
    private final EstacionService estacionService;
    private final BicicletaService bicicletaService;

    public List<Uso> getAll(){
        return usoRepository.findAll();
    }

    public Uso getById (Long id){
        return usoRepository.findById(id).orElseThrow(() -> new RuntimeException("Uso no encontrado"));
    }

    public Uso save(Uso u){
        return usoRepository.save(u);
    }

    public Uso inicializarUso(String numTarjeta, String pin, Long idEstacion, Long idBicicleta) throws BadRequestException {
        Usuario usuario = usuarioService.authentication(numTarjeta, pin).orElseThrow(() -> new BadRequestException("La tarjeta o el pin no son correctos"));

        if(usuario.getSaldo() <UMBRAL_SALDO_MINIMO)
            throw new BadRequestException("Saldo insuficiente");

        Estacion estacion = estacionService.getById(idEstacion);
        Bicicleta bicicleta = bicicletaService.getById(idBicicleta);

        Uso.builder()
                .
    }

}
