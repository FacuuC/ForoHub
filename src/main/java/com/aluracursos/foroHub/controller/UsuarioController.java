package com.aluracursos.foroHub.controller;

import com.aluracursos.foroHub.domain.Usuario.Usuario;
import com.aluracursos.foroHub.dto.DatosRegistroUsuario;
import com.aluracursos.foroHub.dto.DatosRespuestaUsuario;
import com.aluracursos.foroHub.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaUsuario> registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datos) {
        Usuario usuario = usuarioRepository.save(new Usuario(datos));
        return ResponseEntity.ok(new DatosRespuestaUsuario(usuario));
    }
}
