package com.gov.mintic.cartera.ingresoegreso.controller;


import com.gov.mintic.cartera.ingresoegreso.entity.Perfil;
import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import com.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import com.gov.mintic.cartera.ingresoegreso.entity.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.gov.mintic.cartera.ingresoegreso.entity.Perfil.RRHH;

@RestController
@RequestMapping("/api/usuario")
public class UsiarioRestController {

    @GetMapping("/{id}")
    public Usuario findByUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(id);
        usuario.setApellido("Rodriguez");
        usuario.setContrasenha("1234");
        usuario.setEstado(true);
        usuario.setNombre("Oscar");
        usuario.setNumeroIdentificacion("111111111");
        Perfil perfil = RRHH;
        usuario.setPerfil(perfil);
        Rol rol = new Rol();
        rol.setIdRol(1L);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario.setRol(rol);
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(1L);
        tipoDocumento.setDescripcion("Cedula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        usuario.setTipoDocumento(tipoDocumento);
        usuario.setUsuario("user");
        return usuario;
    }

    @GetMapping("/")
    public List<Usuario> findAll(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1L);
        usuario.setApellido("Rodriguez");
        usuario.setContrasenha("1234");
        usuario.setEstado(true);
        usuario.setNombre("Oscar");
        usuario.setNumeroIdentificacion("111111111");
        Perfil perfil = RRHH;
        usuario.setPerfil(perfil);
        Rol rol = new Rol();
        rol.setIdRol(1L);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario.setRol(rol);
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(1L);
        tipoDocumento.setDescripcion("Cedula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        usuario.setTipoDocumento(tipoDocumento);
        usuario.setUsuario("user");
        usuarios.add(usuario);
        Usuario usuario2 = new Usuario();
        usuario2.setIdUsuario(2L);
        usuario2.setApellido("Rodriguez");
        usuario2.setContrasenha("1234");
        usuario2.setEstado(true);
        usuario2.setNombre("Oscar");
        usuario2.setNumeroIdentificacion("111111111");
        Perfil perfil2 = Perfil.Financiera;
        usuario2.setPerfil(perfil2);
        Rol rol2 = new Rol();
        rol2.setIdRol(2L);
        rol2.setDescripcion("Admin");
        rol2.setEstado(true);
        usuario2.setRol(rol2);
        TipoDocumento tipoDocumento2 = new TipoDocumento();
        tipoDocumento2.setIdTipoDocumento(2L);
        tipoDocumento2.setDescripcion("Cedula de ciudadania");
        tipoDocumento2.setSiglas("CC");
        tipoDocumento2.setEstado(true);
        usuario2.setTipoDocumento(tipoDocumento2);
        usuario2.setUsuario("user");
        usuarios.add(usuario2);
        return usuarios;
    }

    @PostMapping("/")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        Usuario newUsuario = new Usuario();
        newUsuario.setIdUsuario(3L);
        newUsuario.setApellido(usuario.getApellido());
        newUsuario.setContrasenha(usuario.getContrasenha());
        newUsuario.setEstado(usuario.isEstado());
        newUsuario.setNombre(usuario.getNombre());
        newUsuario.setNumeroIdentificacion(usuario.getNumeroIdentificacion());
        newUsuario.setPerfil(usuario.getPerfil());
        newUsuario.setRol(usuario.getRol());
        newUsuario.setTipoDocumento(usuario.getTipoDocumento());
        newUsuario.setUsuario(usuario.getUsuario());
        return newUsuario;
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario putUsuario = findByUsuario(id);
        putUsuario.setApellido(usuario.getApellido());
        putUsuario.setContrasenha(usuario.getContrasenha());
        putUsuario.setEstado(usuario.isEstado());
        putUsuario.setNombre(usuario.getNombre());
        putUsuario.setNumeroIdentificacion(usuario.getNumeroIdentificacion());
        putUsuario.setPerfil(usuario.getPerfil());
        putUsuario.setRol(usuario.getRol());
        putUsuario.setTipoDocumento(usuario.getTipoDocumento());
        putUsuario.setUsuario(usuario.getUsuario());
        return putUsuario;
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario closeUsuario = findByUsuario(id);
    }

}
