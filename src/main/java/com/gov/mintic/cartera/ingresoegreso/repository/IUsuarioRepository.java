package com.gov.mintic.cartera.ingresoegreso.repository;

import com.gov.mintic.cartera.ingresoegreso.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
