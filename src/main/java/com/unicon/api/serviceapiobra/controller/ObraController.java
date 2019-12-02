package com.unicon.api.serviceapiobra.controller;

import com.unicon.api.serviceapiobra.beans.ObraBean;
import com.unicon.api.serviceapiobra.beans.ResponseBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/")
public class ObraController {

    private static Logger log = LoggerFactory.getLogger(ObraController.class);

    @GetMapping("")
    public List<ObraBean> getObras() {
        log.info("listar obras");
        List<ObraBean> list = new ArrayList<>();
        list.add(new ObraBean(1, "24872525983", "Obra 01", "L09", 1));
        list.add(new ObraBean(1, "73473457774", "Obra 02", "P01", 2));
        list.add(new ObraBean(1, "89357474575", "Obra 03", "LIMA", 3));
        list.add(new ObraBean(1, "23452634664", "Obra 04", "QP3", 4));
        return list;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean crear(@RequestBody ObraBean obra) {
        log.info("crear obra: " + obra.toString());
        ResponseBean response = new ResponseBean();
        response.setId(0);
        response.setEstado(ResponseBean.STATUS_CREADO);
        response.setCodigo("PO16");
        response.setMensaje("OK");
        response.setResultado(true);
        return response;
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean actualizar(@RequestBody ObraBean obra) {
        log.info("actualizar obra: " + obra.toString());
        ResponseBean response = new ResponseBean();
        response.setId(0);
        response.setEstado(ResponseBean.STATUS_MODIFICADO);
        response.setCodigo("PO16");
        response.setMensaje("OK");
        response.setResultado(true);
        return response;
    }

}
