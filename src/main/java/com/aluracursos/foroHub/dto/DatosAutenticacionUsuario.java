package com.aluracursos.foroHub.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacionUsuario(
    @NotBlank
    String email,
    @NotBlank
    String password
) {}
