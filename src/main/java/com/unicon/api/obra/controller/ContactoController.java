package com.unicon.api.obra.controller;

import com.unicon.api.obra.beans.ContactoBean;
import com.unicon.api.obra.beans.ResponseContactoBean;
import com.unicon.api.obra.service.IObraService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoController {

    private static Logger log = LoggerFactory.getLogger(ContactoController.class);

    @Autowired
    public IObraService obraService;

    @GetMapping("")
    public List<ContactoBean> getContactos() {
        log.info("listar contactos");
        List<ContactoBean> list = new ArrayList<>();
        list.add(new ContactoBean(1, "KT17", "01", "Contacto 001", "Admin", "admin@admin.com", "92582389"));
        list.add(new ContactoBean(1, "KT17", "02", "Contacto 002", "Admin2", "admin2@admin.com", "92582389"));
        list.add(new ContactoBean(1, "KT17", "03", "Contacto 003", "Admin3", "admin3@admin.com", "92582389"));
        list.add(new ContactoBean(1, "KT17", "04", "Contacto 004", "Admin4", "admin4@admin.com", "92582389"));
        return list;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseContactoBean crear(@RequestBody ContactoBean contacto) {
        log.info("crear contacto: " + contacto.toString());
        return obraService.crearObraContacto(contacto);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseContactoBean actualizar(@RequestBody ContactoBean contacto) {
        log.info("actualizar contacto: " + contacto.toString());
        return obraService.actualizarObraContacto(contacto);
    }
}
