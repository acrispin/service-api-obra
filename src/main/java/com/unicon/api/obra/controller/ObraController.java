package com.unicon.api.obra.controller;

import com.unicon.api.commons.beans.obra.ObraBean;
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
@RequestMapping("/")
public class ObraController {

    private static Logger log = LoggerFactory.getLogger(ObraController.class);

    @Autowired
    public IObraService obraService;

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
    public ResponseObraBean crear(@RequestBody ObraBean obra) {
        log.info("crear obra: " + obra.toString());
        return obraService.crearObra(obra);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseObraBean actualizar(@RequestBody ObraBean obra) {
        log.info("actualizar obra: " + obra.toString());
        return obraService.actualizarObra(obra);
    }

}
