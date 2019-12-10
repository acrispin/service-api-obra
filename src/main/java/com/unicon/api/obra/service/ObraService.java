package com.unicon.api.obra.service;

import com.unicon.api.obra.beans.ContactoBean;
import com.unicon.api.obra.beans.FrenteBean;
import com.unicon.api.obra.beans.ObraBean;
import com.unicon.api.obra.beans.ResponseContactoBean;
import com.unicon.api.obra.beans.ResponseObraBean;
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
    public ResponseContactoBean crearObraContacto(ContactoBean contacto) {
        contacto.setSecuencia(null);
        return new ObraDao(contacto.getIdMarca()).registrarObraContacto(contacto);
    }

    @Override
    public ResponseContactoBean actualizarObraContacto(ContactoBean contacto) {
        return new ObraDao(contacto.getIdMarca()).registrarObraContacto(contacto);
    }

    @Override
    public ResponseObraBean crearObraFrente(FrenteBean frente) {
        frente.setIdFrente(0);
        return new ObraDao(frente.getIdMarca()).registrarObraFrente(frente);
    }

    @Override
    public ResponseObraBean actualizarObraFrente(FrenteBean frente) {
        return new ObraDao(frente.getIdMarca()).registrarObraFrente(frente);
    }

}
