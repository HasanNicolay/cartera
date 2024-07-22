package com.gov.mintic.cartera.ingresoegreso.servicie;

import com.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoDocumentoService implements ITipoDocuemnto{
    @Override
    public TipoDocumento findTipoDocumento(Long id) {
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(id);
        tipoDocumento.setDescripcion("Cedula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        return tipoDocumento;
    }

    @Override
    public List<TipoDocumento> finAllTipoDocumento() {
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

    @Override
    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento newTipoDocuemnto = new TipoDocumento();
        newTipoDocuemnto.setIdTipoDocumento(3L);
        newTipoDocuemnto.setDescripcion(tipoDocumento.getDescripcion());
        newTipoDocuemnto.setSiglas(tipoDocumento.getSiglas());
        newTipoDocuemnto.setEstado(tipoDocumento.isEstado());
        return newTipoDocuemnto;
    }

    @Override
    public TipoDocumento updateTipoDocumento(Long id, TipoDocumento tipoDocumento) {
        TipoDocumento putTipoDocumento = findTipoDocumento(id);
        putTipoDocumento.setDescripcion(tipoDocumento.getDescripcion());
        putTipoDocumento.setSiglas(tipoDocumento.getSiglas());
        putTipoDocumento.setEstado(tipoDocumento.isEstado());
        return putTipoDocumento;
    }

    @Override
    public void deleteTipoDocumento(Long id, TipoDocumento tipoDocumento) {
        TipoDocumento closeTipoDocumento = findTipoDocumento(id);
    }
}
