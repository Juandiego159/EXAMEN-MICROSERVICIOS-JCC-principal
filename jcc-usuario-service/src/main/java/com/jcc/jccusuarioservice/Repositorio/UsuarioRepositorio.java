package com.jcc.jccusuarioservice.Repositorio;

import com.jcc.jccusuarioservice.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
