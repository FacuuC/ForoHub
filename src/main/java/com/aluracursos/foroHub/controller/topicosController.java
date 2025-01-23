package com.aluracursos.foroHub.controller;

import com.aluracursos.foroHub.domain.DatosRegistroTopico;
import com.aluracursos.foroHub.domain.Topico;
import com.aluracursos.foroHub.domain.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class topicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
    }
}
