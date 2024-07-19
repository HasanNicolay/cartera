package com.gov.mintic.cartera.ingresoegreso.controller;

import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolRestController {

    @GetMapping("/{id}")
    public Rol findById(@PathVariable Long id){
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return rol;
    }

    @GetMapping("/")
    public List<Rol> finAll(){
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol();
        rol1.setIdRol(1L);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);
        roles.add(rol1);
        Rol rol2 = new Rol();
        rol2.setIdRol(2L);
        rol2.setDescripcion("Admin");
        rol2.setEstado(true);
        roles.add(rol2);
        return roles;
    }

    @PostMapping("/")
    public Rol createRol(@RequestBody Rol rol){
        Rol newRol = new Rol();
        newRol.setIdRol(3L);
        newRol.setDescripcion(rol.getDescripcion());
        newRol.setEstado(rol.isEstado());
        return newRol;
    }

    @PutMapping("/{id}")
    public Rol updateRol(@PathVariable Long id, @RequestBody Rol rol){
        Rol putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());
        return putRol;
    }

    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable Long id, @RequestBody Rol rol){
        Rol closeRol = findById(id);
    }

}
