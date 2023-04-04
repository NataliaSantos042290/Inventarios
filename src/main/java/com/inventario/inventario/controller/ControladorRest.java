package com.inventario.inventario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {
    //El GetMapping nos permite definir cual sera la ruta que debo escribir para que responda el metodo.
    @GetMapping("/")
    public String saludar(){
        return "Proyecto con Spring boot";
    }

    @GetMapping("/about")
    public String presentar(){
        return "Hola soy Natalia Rocio Santos Santos";
    }
}
