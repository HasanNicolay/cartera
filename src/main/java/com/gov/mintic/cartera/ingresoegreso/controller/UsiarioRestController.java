package com.gov.mintic.cartera.ingresoegreso.controller;


import com.gov.mintic.cartera.ingresoegreso.entity.Perfil;
import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import com.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import com.gov.mintic.cartera.ingresoegreso.entity.Usuario;
import com.gov.mintic.cartera.ingresoegreso.servicie.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.gov.mintic.cartera.ingresoegreso.entity.Perfil.RRHH;

@RestController
@RequestMapping("/api/usuario")
public class UsiarioRestController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/{id}")
    public Usuario findByUsuario(@PathVariable Long id){

        return usuarioService.findByUsuario(id);
    }

    @GetMapping("/")
    public List<Usuario> findAll(){
       return usuarioService.findAll();
    }

    @PostMapping("/")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        usuarioService.deleteUsuario(id, usuario);
    }

}
