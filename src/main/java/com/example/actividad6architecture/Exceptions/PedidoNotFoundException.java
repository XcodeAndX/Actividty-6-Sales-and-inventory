package com.example.actividad6architecture.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PedidoNotFoundException extends RuntimeException {
    public PedidoNotFoundException(String mensaje) {
        super(mensaje);
    }
}
