package com.aluracursos.foroHub.domain.Topico;

import com.aluracursos.foroHub.dto.DatosRegistroTopico;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.aluracursos.foroHub.dto.DatosActualizarTopico;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;

import com.aluracursos.foroHub.domain.Usuario.Usuario;

@Entity(name= "Topico")
@Table(name = "topicos")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private String mensaje;
    @NotNull
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaDeCreacion;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @NotBlank
    private String nombreCurso;

    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Topico(){}

    public Topico(DatosRegistroTopico datosRegistroTopico, Usuario usuario) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje= datosRegistroTopico.mensaje();
        this.fechaDeCreacion = LocalDateTime.now();
        this.estado=Estado.ACTIVO;
    System.out.println(Estado.ACTIVO);
        this.usuario=usuario;
        this.nombreCurso = datosRegistroTopico.nombreCurso();
    }

    public Long getId() {
        return id;
    }

    public @NotBlank String getTitulo() {
        return titulo;
    }

    public @NotBlank String getMensaje() {
        return mensaje;
    }

    public @NotNull LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void actualizarDatos (DatosActualizarTopico datos){
        if (datos.titulo() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El titulo no puede ser nulo");
        }
        if (datos.mensaje() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El mensaje no puede ser nulo");
        }
        if (datos.nombreCurso() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre del curso no puede ser nulo");
        }
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.nombreCurso = datos.nombreCurso();
    }
}

