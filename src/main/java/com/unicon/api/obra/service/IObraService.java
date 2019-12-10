package com.unicon.api.obra.service;

import com.unicon.api.obra.beans.ContactoBean;
import com.unicon.api.obra.beans.FrenteBean;
import com.unicon.api.obra.beans.ObraBean;
import com.unicon.api.obra.beans.ResponseContactoBean;
import com.unicon.api.obra.beans.ResponseObraBean;

public interface IObraService {

    ResponseObraBean crearObra(ObraBean obra);

    ResponseObraBean actualizarObra(ObraBean obra);

    ResponseContactoBean crearObraContacto(ContactoBean contacto);

    ResponseContactoBean actualizarObraContacto(ContactoBean contacto);

    ResponseObraBean crearObraFrente(FrenteBean frente);

    ResponseObraBean actualizarObraFrente(FrenteBean frente);
}
