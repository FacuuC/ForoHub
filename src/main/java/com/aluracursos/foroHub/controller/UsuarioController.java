package com.aluracursos.foroHub.controller;

import com.aluracursos.foroHub.domain.Usuario.Usuario;
import com.aluracursos.foroHub.dto.DatosRegistroUsuario;
import com.aluracursos.foroHub.dto.DatosRespuestaUsuario;
import com.aluracursos.foroHub.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<DatosRespuestaUsuario> registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datos) {
        if(usuarioRepository.findByEmail(datos.email()).isPresent()) {
            throw new RuntimeException("Email ya registrado");
        }
        
        Usuario usuario = new Usuario();
        usuario.setNombre(datos.nombre());
        usuario.setEmail(datos.email());
        usuario.setPassword(passwordEncoder.encode(datos.contraseña()));
        
        usuarioRepository.save(usuario);
        System.out.println("Usuario registrado: " + usuario.getUsername()); // Log para debug
        
        return ResponseEntity.ok(new DatosRespuestaUsuario(usuario));
    }
}
