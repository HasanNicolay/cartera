package com.gov.mintic.cartera.ingresoegreso.servicie;

import com.gov.mintic.cartera.ingresoegreso.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IUsuarioService {

    public Usuario findByUsuario(Long id);

    public List<Usuario> findAll();

    public Usuario createUsuario(Usuario usuario);

    public Usuario updateUsuario(Long id, Usuario usuario);

    public void deleteUsuario(Long id);

}
