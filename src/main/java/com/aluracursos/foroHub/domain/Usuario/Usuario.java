package com.aluracursos.foroHub.domain.Usuario;

import com.aluracursos.foroHub.dto.DatosRegistroUsuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="Usuario")
@Table(name="usuarios")
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String email;
    @NotBlank
    private String contraseña;

    public Usuario() {}

    public Usuario(@Valid DatosRegistroUsuario datos) {
        this.nombre = datos.nombre();
        this.email = datos.email();
        this.contraseña = datos.contraseña();
    }

    public @NotBlank String getEmail() {
        return email;
    }

    public @NotBlank String getNombre() {
        return nombre;
    }

    public Long getId() {
        return Id;
    }
}
