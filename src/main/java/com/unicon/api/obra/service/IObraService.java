package com.unicon.api.obra.service;

import com.unicon.api.commons.beans.obra.ObraBean;
import com.unicon.api.commons.beans.obra.ObraContactoBean;
import com.unicon.api.commons.beans.obra.ObraFrenteBean;
import com.unicon.api.commons.beans.obra.ResponseObraBean;
import com.unicon.api.commons.beans.obra.ResponseObraContactoBean;

public interface IObraService {

    ResponseObraBean crearObra(ObraBean obra);

    ResponseObraBean actualizarObra(ObraBean obra);

    ResponseObraContactoBean crearObraContacto(ObraContactoBean contacto);

    ResponseObraContactoBean actualizarObraContacto(ObraContactoBean contacto);

    ResponseObraBean crearObraFrente(ObraFrenteBean frente);

    ResponseObraBean actualizarObraFrente(ObraFrenteBean frente);
}
