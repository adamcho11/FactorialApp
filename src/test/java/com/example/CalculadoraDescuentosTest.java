package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescuentosTest {
    @Test
    void testDescuentoNormal() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        double resultado = calc.calcularPrecioFinal(100.0, 20.0);
        assertEquals(80.00, resultado);
    }

    @Test
    void testDescuentoCero() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        double resultado = calc.calcularPrecioFinal(100.0, 0.0);
        assertEquals(100.00, resultado);
    }

    @Test
    void testDescuentoCien() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        double resultado = calc.calcularPrecioFinal(100.0, 100.0);
        assertEquals(0.00, resultado);
    }

    @Test
    void testPorcentajeDescuentoNegativo() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularPrecioFinal(100.0, -5.0);
        });
        assertTrue(exception.getMessage().contains("porcentaje de descuento"));
    }

    @Test
    void testPorcentajeDescuentoMayorCien() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularPrecioFinal(100.0, 150.0);
        });
        assertTrue(exception.getMessage().contains("porcentaje de descuento"));
    }

    @Test
    void testPrecioOriginalCero() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularPrecioFinal(0.0, 10.0);
        });
        assertTrue(exception.getMessage().contains("precio original"));
    }

    @Test
    void testPrecioOriginalNegativo() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularPrecioFinal(-50.0, 10.0);
        });
        assertTrue(exception.getMessage().contains("precio original"));
    }

    @Test
    void testRedondeoDosDecimales() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        double resultado = calc.calcularPrecioFinal(99.99, 33.33);
        assertEquals(66.66, resultado);
    }
}
