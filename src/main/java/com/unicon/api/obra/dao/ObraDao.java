package com.unicon.api.obra.dao;

import com.unicon.api.commons.db.dao.DaoApplication;
import com.unicon.api.commons.db.dao.enums.EConnectionType;
import com.unicon.api.obra.beans.*;
import com.unicon.api.obra.mapper.IObraMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

@Log4j2
public class ObraDao extends DaoApplication<ObraBean, IObraMapper> {

    public ObraDao(int idMarca) {
        super(String.valueOf(idMarca));
    }

    @Override
    protected Class<ObraBean> getClassType() {
        return ObraBean.class;
    }

    @Override
    protected Logger getLogger() {
        return log;
    }

    @Override
    protected EConnectionType getConnectionType() {
        return EConnectionType.SDC;
    }

    @Override
    protected Class<IObraMapper> getMapperType() {
        return IObraMapper.class;
    }

    public ResponseObraBean registrarObra(ObraBean obra) {
        return executeDml("registrarObra", obra);
    }

    public ResponseContactoBean registrarObraContacto(ContactoBean contacto) {
        return executeDml("registrarObraContacto", contacto);
    }

    public ResponseObraBean registrarObraFrente(FrenteBean frente) {
        return executeDml("registrarObraFrente", frente);
    }

}
