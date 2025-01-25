package com.aluracursos.foroHub.dto;

import java.time.LocalDateTime;
import com.aluracursos.foroHub.domain.Topico.Topico;

public record DatosRespuestaTopico(
    Long id,
    String usuario,
    String titulo, 
    String mensaje, 
    LocalDateTime fechaCreacion
) {
    public DatosRespuestaTopico(Topico topico) {
        this(topico.getId(), topico.getUsuario().getNombre(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion());
    }
}
