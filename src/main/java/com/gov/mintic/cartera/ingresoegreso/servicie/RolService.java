package com.gov.mintic.cartera.ingresoegreso.servicie;

import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import com.gov.mintic.cartera.ingresoegreso.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IRolService {

    @Autowired
    private IRolRepository rolRepository;
    @Override
    public Rol findById(Long id) {
        Optional<Rol> rol = rolRepository.findById(id);
        return rol.get();
    }

    @Override
    public List<Rol> finAll() {
        List<Rol> roles = (List<Rol>) rolRepository.findAll();
        return roles;
    }

    @Override
    public Rol createRol(Rol rol) {
        Rol newRol = rolRepository.save(rol);
        return newRol;
    }

    @Override
    public Rol updateRol(Long id, Rol rol) {
        //Esto solo funciona en springbot
        Rol putRol = rolRepository.save(rol);
        return putRol;
    }

    @Override
    public void deleteRol(Long id) {
        rolRepository.deleteById(id);
    }
}
