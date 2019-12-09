package com.unicon.api.serviceapiobra.controller;


import com.unicon.api.serviceapiobra.beans.FrenteBean;
import com.unicon.api.serviceapiobra.beans.ResponseBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/frente")
public class FrenteController {

    private static Logger log = LoggerFactory.getLogger(FrenteController.class);

    @GetMapping("")
    public List<FrenteBean> getFrentes() {
        log.info("listar frentes");
        List<FrenteBean> lista = new ArrayList<>();
        lista.add(new FrenteBean(1, 101, "LP11", "QWERTY12345671", "Frente 01", "Av."));
        lista.add(new FrenteBean(1, 102, "HP92", "QWERTY12345672", "Frente 02", "Av."));
        lista.add(new FrenteBean(1, 103, "HP93", "QWERTY12345673", "Frente 03", "Av."));
        lista.add(new FrenteBean(1, 104, "HP21", "QWERTY12345674", "Frente 04", "Av."));
        return lista;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean crear(@RequestBody FrenteBean frente) {
        log.info("crear frente: " + frente);
        ResponseBean response = new ResponseBean();
        response.setId(34);
        response.setEstado(ResponseBean.STATUS_CREADO);
        response.setCodigo(null);
        response.setMensaje("OK");
        response.setResultado(true);
        return response;
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean actualizar(@RequestBody FrenteBean frente) {
        log.info("actualizar frente: " + frente);
        ResponseBean response = new ResponseBean();
        response.setId(34);
        response.setEstado(ResponseBean.STATUS_MODIFICADO);
        response.setCodigo(null);
        response.setMensaje("OK");
        response.setResultado(true);
        return response;
    }

}
