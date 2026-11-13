package com.fiap.calculadora.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    @GetMapping("/somar")
    public int somar(@RequestParam(defaultValue = "0")int a, @RequestParam(defaultValue = "0")int b){
        return a+b;
    }
    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(defaultValue = "0")int a, @RequestParam(defaultValue = "0")int b){
        return a-b;
    }
    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam(defaultValue = "0")int a, @RequestParam(defaultValue = "0")int b){
        return a*b;
    }
    @GetMapping("/dividir")
    public double dividir(@RequestParam(defaultValue = "0")double a, @RequestParam(defaultValue = "0")double b){
        if (b==0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Não existe divisão por zero");
        }
        return a/b;
    }
}
