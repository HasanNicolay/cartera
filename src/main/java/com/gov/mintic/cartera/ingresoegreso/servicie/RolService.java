package com.gov.mintic.cartera.ingresoegreso.servicie;

import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolService implements IRolService {

    @Override
    public Rol findById(Long id) {
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return rol;
    }

    @Override
    public List<Rol> finAll() {
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

    @Override
    public Rol createRol(Rol rol) {
        Rol newRol = new Rol();
        newRol.setIdRol(3L);
        newRol.setDescripcion(rol.getDescripcion());
        newRol.setEstado(rol.isEstado());
        return newRol;
    }

    @Override
    public Rol updateRol(Long id, Rol rol) {
        Rol putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());
        return putRol;
    }

    @Override
    public void deleteRol(Long id, Rol rol) {
        Rol closeRol = findById(id);
    }
}
