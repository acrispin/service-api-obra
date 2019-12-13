package com.unicon.api.obra.controller;

import com.unicon.api.commons.beans.obra.ObraFrenteBean;
import com.unicon.api.commons.beans.obra.ResponseObraBean;
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
@RequestMapping("/frente")
public class FrenteController {

    private static Logger log = LoggerFactory.getLogger(FrenteController.class);

    @Autowired
    public IObraService obraService;

    @GetMapping("")
    public List<ObraFrenteBean> getFrentes() {
        log.info("listar frentes");
        List<ObraFrenteBean> lista = new ArrayList<>();
        lista.add(new ObraFrenteBean(1, 101, "LP11", "QWERTY12345671", "Frente 01", "Av."));
        lista.add(new ObraFrenteBean(1, 102, "HP92", "QWERTY12345672", "Frente 02", "Av."));
        lista.add(new ObraFrenteBean(1, 103, "HP93", "QWERTY12345673", "Frente 03", "Av."));
        lista.add(new ObraFrenteBean(1, 104, "HP21", "QWERTY12345674", "Frente 04", "Av."));
        return lista;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObraBean crear(@RequestBody ObraFrenteBean frente) {
        log.info("crear frente: " + frente);
        return obraService.crearObraFrente(frente);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObraBean actualizar(@RequestBody ObraFrenteBean frente) {
        log.info("actualizar frente: " + frente);
        return obraService.actualizarObraFrente(frente);
    }

}
