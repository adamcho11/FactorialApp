/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorialDeCero() {
        assertEquals(1, Factorial.calcular(0));
    }

    @Test
    void testFactorialDeCinco() {
        assertEquals(120, Factorial.calcular(5));
    }

    @Test
    void testFactorialNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calcular(-1));
    }
}
