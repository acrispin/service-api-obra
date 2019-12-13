package com.unicon.api.obra.controller;

import com.unicon.api.commons.beans.obra.ObraContactoBean;
import com.unicon.api.commons.beans.obra.ResponseObraContactoBean;
import com.unicon.api.obra.service.IObraService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoController {

    private static Logger log = LoggerFactory.getLogger(ContactoController.class);

    @Autowired
    public IObraService obraService;

    @GetMapping("")
    public List<ObraContactoBean> getContactos() {
        log.info("listar contactos");
        List<ObraContactoBean> list = new ArrayList<>();
        list.add(new ObraContactoBean(1, "KT17", "01", "Contacto 001", "Admin", "admin@admin.com", "92582389"));
        list.add(new ObraContactoBean(1, "KT17", "02", "Contacto 002", "Admin2", "admin2@admin.com", "92582389"));
        list.add(new ObraContactoBean(1, "KT17", "03", "Contacto 003", "Admin3", "admin3@admin.com", "92582389"));
        list.add(new ObraContactoBean(1, "KT17", "04", "Contacto 004", "Admin4", "admin4@admin.com", "92582389"));
        return list;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObraContactoBean crear(@RequestBody ObraContactoBean contacto) {
        log.info("crear contacto: " + contacto.toString());
        return obraService.crearObraContacto(contacto);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObraContactoBean actualizar(@RequestBody ObraContactoBean contacto) {
        log.info("actualizar contacto: " + contacto.toString());
        return obraService.actualizarObraContacto(contacto);
    }
}
