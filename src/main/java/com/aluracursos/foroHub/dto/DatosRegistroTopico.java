package com.aluracursos.foroHub.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
    @NotBlank(message = "El usuario es obligatorio" )
    String usuario,

    @NotBlank(message = "El mensaje es obligatorio")
    String mensaje,

    @NotBlank(message = "El nombre del curso es obligatorio")
    String nombreCurso,
    
    @NotBlank(message = "El titulo es obligatorio")
    String titulo
) {}
