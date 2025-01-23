package com.aluracursos.foroHub.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    private Integer idUsuario;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaDeCreacion;
    private String estado;
    private String usuario;
    private String nombreCurso;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.idUsuario = datosRegistroTopico.idUsuario();
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje= datosRegistroTopico.mensaje();
        this.nombreCurso = datosRegistroTopico.nombreCurso();
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
