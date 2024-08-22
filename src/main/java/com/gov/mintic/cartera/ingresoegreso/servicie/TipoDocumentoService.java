package com.gov.mintic.cartera.ingresoegreso.servicie;

import com.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import com.gov.mintic.cartera.ingresoegreso.repository.ITipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService implements ITipoDocuemnto{

    @Autowired
    private ITipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public TipoDocumento findTipoDocumento(Long id) {
        Optional<TipoDocumento> tipoDocumento = tipoDocumentoRepository.findById(id);
        return tipoDocumento.get();
    }

    @Override
    public List<TipoDocumento> finAllTipoDocumento() {
        List<TipoDocumento> tiposDocumentos = (List<TipoDocumento>) tipoDocumentoRepository.findAll();
        return tiposDocumentos;
    }

    @Override
    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento newTipoDocuemnto = tipoDocumentoRepository.save(tipoDocumento);
        return newTipoDocuemnto;
    }

    @Override
    public TipoDocumento updateTipoDocumento(Long id, TipoDocumento tipoDocumento) {
        TipoDocumento putTipoDocumento = tipoDocumentoRepository.save(tipoDocumento);
        return putTipoDocumento;
    }

    @Override
    public void deleteTipoDocumento(Long id) {
        tipoDocumentoRepository.deleteById(id);
    }
}
