package com.example.kubernetes.saludo.controller;

import com.example.kubernetes.saludo.dto.SaludoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/saludo")
public class SaludoController {

    @Autowired
    private Environment env;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{nombre}")
    public SaludoDTO saludar(@PathVariable("nombre") String nombre) {

        return new SaludoDTO(new StringBuilder()
                .append("Hola ")
                .append(nombre)
                .append(" ")
                .append("desde backend ")
                .append(env.getProperty("VERSION"))
                .append(" !!")
                .toString()
        );

    }

}
