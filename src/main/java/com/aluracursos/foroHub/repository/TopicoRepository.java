package com.aluracursos.foroHub.repository;

import com.aluracursos.foroHub.domain.Topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
