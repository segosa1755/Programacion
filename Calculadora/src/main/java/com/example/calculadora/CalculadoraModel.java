package com.example.calculadora;

import java.util.ArrayList;
import java.util.List;

// Clase de back end: contiene la lógica de cálculo y gestiona el historial interno
public class CalculadoraModel {

    // Lista interna que guarda todas las operaciones realizadas
    private List<String> historial = new ArrayList<>();

    // Realiza la operación indicada entre dos números y guarda el resultado en el historial
    public double calcular(String operador, double n1, double n2) {
        double resultado;
        switch (operador) {
            case "+": resultado = n1 + n2; break;
            case "-": resultado = n1 - n2; break;
            case "*": resultado = n1 * n2; break;
            case "/":
                // Evita la división por cero devolviendo NaN
                if (n2 == 0) return Double.NaN;
                resultado = n1 / n2;
                break;
            default: resultado = 0;
        }

        // Guarda la operación completa en el historial
        agregarAlHistorial(n1 + " " + operador + " " + n2 + " = " + resultado);
        return resultado;
    }

    // Añade una operación al historial
    public void agregarAlHistorial(String operacion) {
        historial.add(operacion);
    }

    // Devuelve la lista completa del historial
    public List<String> getHistorial() {
        return historial;
    }

    // Vacía el historial completamente
    public void limpiarHistorial() {
        historial.clear();
    }
}