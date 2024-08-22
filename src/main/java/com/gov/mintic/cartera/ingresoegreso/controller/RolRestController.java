package com.gov.mintic.cartera.ingresoegreso.controller;

import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import com.gov.mintic.cartera.ingresoegreso.servicie.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolRestController {

    @Autowired
    private IRolService rolService;

    @GetMapping("/{id}")
    public Rol findById(@PathVariable Long id){
        return rolService.findById(id);
    }

    @GetMapping("/")
    public List<Rol> finAll(){
        return rolService.finAll();
    }

    @PostMapping("/")
    public Rol createRol(@RequestBody Rol rol){
        return rolService.createRol(rol);
    }

    @PutMapping("/{id}")
    public Rol updateRol(@PathVariable Long id, @RequestBody Rol rol){
        return rolService.updateRol(id,rol);
    }

    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable Long id){
        rolService.deleteRol(id);
    }

}
