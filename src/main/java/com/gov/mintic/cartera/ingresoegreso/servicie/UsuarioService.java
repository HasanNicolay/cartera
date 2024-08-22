package com.gov.mintic.cartera.ingresoegreso.servicie;

import com.gov.mintic.cartera.ingresoegreso.entity.Perfil;
import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import com.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import com.gov.mintic.cartera.ingresoegreso.entity.Usuario;
import com.gov.mintic.cartera.ingresoegreso.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.gov.mintic.cartera.ingresoegreso.entity.Perfil.RRHH;

@Service
public class UsuarioService implements  IUsuarioService{

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public Usuario findByUsuario(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.get();
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        return usuarios;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario newUsuario = usuarioRepository.save(usuario);
        return newUsuario;
    }

    @Override
    public Usuario updateUsuario(Long id, Usuario usuario) {
        Usuario putUsuario = usuarioRepository.save(usuario);
        return putUsuario;
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
