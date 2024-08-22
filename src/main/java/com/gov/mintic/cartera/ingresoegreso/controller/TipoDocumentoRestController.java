package com.gov.mintic.cartera.ingresoegreso.controller;


import com.gov.mintic.cartera.ingresoegreso.entity.Rol;
import com.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import com.gov.mintic.cartera.ingresoegreso.servicie.ITipoDocuemnto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tipoDocumento")
public class TipoDocumentoRestController {

    @Autowired
    private ITipoDocuemnto tipoDocuemntoService;

    @GetMapping("/{id}")
    public TipoDocumento findTipoDocumento(@PathVariable Long id){
        return tipoDocuemntoService.findTipoDocumento(id);
    }

    @GetMapping("/")
    public List<TipoDocumento> finAllTipoDocumento(){
        return tipoDocuemntoService.finAllTipoDocumento();
    }

    @PostMapping("/")
    public TipoDocumento createTipoDocumento(@RequestBody TipoDocumento tipoDocumento){
        return tipoDocuemntoService.createTipoDocumento(tipoDocumento);
    }

    @PutMapping("/{id}")
    public TipoDocumento updateTipoDocumento(@PathVariable Long id, @RequestBody TipoDocumento tipoDocumento){
        return tipoDocuemntoService.updateTipoDocumento(id, tipoDocumento);
    }

    @DeleteMapping("/{id}")
    public void deleteTipoDocumento(@PathVariable Long id){
        tipoDocuemntoService.deleteTipoDocumento(id);
    }

}
