package com.gov.mintic.cartera.ingresoegreso.controller;


import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import com.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tipoDocumento")
public class TipoDocumentoRestController {

    @GetMapping("/{id}")
    public TipoDocumento findTipoDocumento(@PathVariable Long id){
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(1L);
        tipoDocumento.setDescripcion("Cedula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        return tipoDocumento;
    }

    @GetMapping("/")
    public List<TipoDocumento> finAllTipoDocumento(){
        List<TipoDocumento> tiposDocumentos = new ArrayList<TipoDocumento>();
        TipoDocumento cedula = new TipoDocumento();
        cedula.setIdTipoDocumento(1L);
        cedula.setDescripcion("Cedula de ciudadania");
        cedula.setSiglas("CC");
        cedula.setEstado(true);
        tiposDocumentos.add(cedula);
        TipoDocumento tarjetaIdentidad = new TipoDocumento();
        tarjetaIdentidad.setIdTipoDocumento(2L);
        tarjetaIdentidad.setDescripcion("Tarjeta de identidad");
        tarjetaIdentidad.setSiglas("TI");
        tarjetaIdentidad.setEstado(true);
        tiposDocumentos.add(tarjetaIdentidad);
        return tiposDocumentos;
    }

    @PostMapping("/")
    public TipoDocumento createTipoDocumento(@RequestBody TipoDocumento tipoDocumento){
        TipoDocumento newTipoDocuemnto = new TipoDocumento();
        newTipoDocuemnto.setIdTipoDocumento(3L);
        newTipoDocuemnto.setDescripcion(tipoDocumento.getDescripcion());
        newTipoDocuemnto.setSiglas(tipoDocumento.getSiglas());
        newTipoDocuemnto.setEstado(tipoDocumento.isEstado());
        return newTipoDocuemnto;
    }

    @PutMapping("/{id}")
    public TipoDocumento updateTipoDocumento(@PathVariable Long id, @RequestBody TipoDocumento tipoDocumento){
        TipoDocumento putTipoDocumento = findTipoDocumento(id);
        putTipoDocumento.setDescripcion(tipoDocumento.getDescripcion());
        putTipoDocumento.setSiglas(tipoDocumento.getSiglas());
        putTipoDocumento.setEstado(tipoDocumento.isEstado());
        return putTipoDocumento;
    }

    @DeleteMapping("/{id}")
    public void deleteTipoDocumento(@PathVariable Long id, @RequestBody TipoDocumento tipoDocumento){
        TipoDocumento closeTipoDocumento = findTipoDocumento(id);
    }

}
