package com.aluracursos.foroHub.domain.Topico;

import com.aluracursos.foroHub.dto.DatosRegistroTopico;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import com.aluracursos.foroHub.domain.Usuario.Usuario;

@Entity(name= "Topico")
@Table(name = "topicos")
@Getter
@NoArgsConstructor
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
    private LocalDateTime fechaDeCreacion;
    @NotBlank
    private Estado estado;
    @NotBlank
    private String nombreCurso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Topico(DatosRegistroTopico datosRegistroTopico, Usuario usuario) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje= datosRegistroTopico.mensaje();
        this.fechaDeCreacion = LocalDateTime.now();
        this.estado=Estado.ACTIVO;
        this.usuario=usuario;
        this.nombreCurso = datosRegistroTopico.nombreCurso();
    }

    public Usuario getUsuario() {
        return usuario;
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
}
//
//<dependency>
//			<groupId>org.springframework.security</groupId>
//			<artifactId>spring-security-test</artifactId>
//			<scope>test</scope>
//		</dependency>
//<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-security</artifactId>
//		</dependency>
