package com.jcc.jcclibroservice.Repositorio;

import com.jcc.jcclibroservice.Entidad.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
