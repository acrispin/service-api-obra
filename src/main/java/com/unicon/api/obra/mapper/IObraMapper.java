package com.unicon.api.obra.mapper;

import com.unicon.api.obra.beans.ContactoBean;
import com.unicon.api.obra.beans.FrenteBean;
import com.unicon.api.obra.beans.ObraBean;
import com.unicon.api.obra.beans.ResponseContactoBean;
import com.unicon.api.obra.beans.ResponseObraBean;

public interface IObraMapper {

    ResponseObraBean registrarObra(ObraBean obra);

    ResponseContactoBean registrarObraContacto(ContactoBean contacto);

    ResponseObraBean registrarObraFrente(FrenteBean frente);

}
