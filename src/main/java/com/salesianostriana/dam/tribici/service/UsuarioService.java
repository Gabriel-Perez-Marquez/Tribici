package com.salesianostriana.dam.tribici.service;

import com.salesianostriana.dam.tribici.model.Usuario;
import com.salesianostriana.dam.tribici.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Optional<Usuario> authentication(String numTarjeta, String pin){
        return usuarioRepository.findByNumTarjetaAndPin(numTarjeta, pin);
    }

}
