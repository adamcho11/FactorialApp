package com.example;

public class CalculadoraDescuentos {
    public double calcularPrecioFinal(double precioOriginal, double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100");
        }
        if (precioOriginal <= 0) {
            throw new IllegalArgumentException("El precio original debe ser mayor que cero");
        }
        if (porcentajeDescuento == 0) {
            return Math.round(precioOriginal * 100.0) / 100.0;
        }
        if (porcentajeDescuento == 100) {
            return 0.0;
        }
        double precioFinal = precioOriginal * (1 - porcentajeDescuento / 100.0);
        return Math.round(precioFinal * 100.0) / 100.0;
    }
}
