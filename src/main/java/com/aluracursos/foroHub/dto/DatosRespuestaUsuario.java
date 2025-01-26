package com.aluracursos.foroHub.dto;

import com.aluracursos.foroHub.domain.Usuario.Usuario;

public record DatosRespuestaUsuario(Long id, String nombre, String email) {
    public DatosRespuestaUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNombre(), usuario.getUsername());
    }
}
