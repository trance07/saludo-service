package com.example.kubernetes.saludo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaludoDTO {

    private String mensaje;

    public SaludoDTO() {

    }

    public SaludoDTO(String mensaje) {
        this.mensaje = mensaje;
    }

}
