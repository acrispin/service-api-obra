package com.unicon.api.obra.service;

import com.unicon.api.commons.beans.obra.ObraBean;
import com.unicon.api.commons.beans.obra.ObraContactoBean;
import com.unicon.api.commons.beans.obra.ObraFrenteBean;
import com.unicon.api.commons.beans.obra.ResponseObraBean;
import com.unicon.api.commons.beans.obra.ResponseObraContactoBean;
import com.unicon.api.obra.dao.ObraDao;
import org.springframework.stereotype.Service;

@Service
public class ObraService implements IObraService {

    @Override
    public ResponseObraBean crearObra(ObraBean obra) {
        obra.setCodigo(null);
        return new ObraDao(obra.getIdMarca()).registrarObra(obra);
    }

    @Override
    public ResponseObraBean actualizarObra(ObraBean obra) {
        return new ObraDao(obra.getIdMarca()).registrarObra(obra);
    }

    @Override
    public ResponseObraContactoBean crearObraContacto(ObraContactoBean contacto) {
        contacto.setSecuencia(null);
        return new ObraDao(contacto.getIdMarca()).registrarObraContacto(contacto);
    }

    @Override
    public ResponseObraContactoBean actualizarObraContacto(ObraContactoBean contacto) {
        return new ObraDao(contacto.getIdMarca()).registrarObraContacto(contacto);
    }

    @Override
    public ResponseObraBean crearObraFrente(ObraFrenteBean frente) {
        frente.setIdFrente(0);
        return new ObraDao(frente.getIdMarca()).registrarObraFrente(frente);
    }

    @Override
    public ResponseObraBean actualizarObraFrente(ObraFrenteBean frente) {
        return new ObraDao(frente.getIdMarca()).registrarObraFrente(frente);
    }

}
