package com.gov.mintic.cartera.ingresoegreso.servicie;

import com.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;

import java.util.List;

public interface ITipoDocuemnto {

    public TipoDocumento findTipoDocumento(Long id);

    public List<TipoDocumento> finAllTipoDocumento();

    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento);

    public TipoDocumento updateTipoDocumento(Long id, TipoDocumento tipoDocumento);

    public void deleteTipoDocumento(Long id);
}
