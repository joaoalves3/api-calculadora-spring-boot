package com.fiap.calculadora.controller;

import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraControllerTest {

    private final CalculadoraController calculadora = new CalculadoraController();

    @Test
    void deveSomar() {
        assertEquals(5, calculadora.somar(2, 3));
    }

    @Test
    void deveSubtrair() {
        assertEquals(-1, calculadora.subtrair(2, 3));
    }

    @Test
    void deveMultiplicar() {
        assertEquals(6.0, calculadora.multiplicar(2, 3));
    }

    @Test
    void deveDividir() {
        assertEquals(2.5, calculadora.dividir(5, 2));
    }

    @Test
    void naoDeveDividirPorZero() {
        assertThrows(ResponseStatusException.class, () -> calculadora.dividir(5, 0));
    }
}
