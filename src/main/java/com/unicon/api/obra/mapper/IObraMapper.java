package com.unicon.api.obra.mapper;

import com.unicon.api.commons.beans.obra.*;

public interface IObraMapper {

    ResponseObraBean registrarObra(ObraBean obra);

    ResponseObraContactoBean registrarObraContacto(ObraContactoBean contacto);

    ResponseObraBean registrarObraFrente(ObraFrenteBean frente);

}
