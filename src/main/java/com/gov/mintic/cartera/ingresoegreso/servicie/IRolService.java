package com.gov.mintic.cartera.ingresoegreso.servicie;

import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IRolService {

    public Rol findById(Long id);

    public List<Rol> finAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(Long id, Rol rol);

    public void deleteRol(Long id, Rol rol);

}
