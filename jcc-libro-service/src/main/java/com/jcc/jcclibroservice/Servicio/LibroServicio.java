package com.jcc.jcclibroservice.Servicio;

import com.jcc.jcclibroservice.Entidad.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroServicio {

    List<Libro> Listar();
    Optional<Libro> Buscar(Long id);
    Libro Guardar(Libro libro);
    Libro Modificar(Long id, Libro libro);
    void Eliminar(Long id);


}
