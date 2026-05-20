package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

// Clase de front end: gestiona los eventos de la interfaz y conecta con el Model
public class CalculadoraController {

    // Elementos visuales definidos en el FXML
    @FXML private Label display;          // Pantalla principal de números
    @FXML private Label labelHistorial;   // Línea que muestra la operación actual
    @FXML private TextArea areaHistorial; // Panel de texto con el historial completo
    @FXML private VBox panelHistorial;    // Panel de historial (visible/oculto)
    @FXML private VBox panelPrincipal;    // Panel principal de la calculadora

    private double num1 = 0;          // Primer operando de la operación
    private double ultimoNum2 = 0;    // Guarda el segundo operando para repetir con "="
    private String operador = "";     // Operador seleccionado (+, -, *, /)
    private boolean inicio = true;    // Indica si el próximo número empieza desde cero
    private CalculadoraModel model = new CalculadoraModel(); // Instancia del back end

    // Formatea un double eliminando el .0 si es un número entero
    private String formatear(double valor) {
        if (valor == Math.floor(valor) && !Double.isInfinite(valor)) {
            return String.valueOf((long) valor);
        }
        return String.valueOf(valor);
    }

    // Añade el dígito o punto pulsado al display
    @FXML
    protected void onNumeroClick(ActionEvent event) {
        String valor = ((Button) event.getSource()).getText();

        // Evita que se introduzcan dos puntos decimales en el mismo número
        if (valor.equals(".") && display.getText().contains(".")) return;

        if (inicio) {
            display.setText(valor);
            inicio = false;
        } else {
            display.setText(display.getText() + valor);
        }
    }

    // Guarda el primer número y el operador seleccionado
    @FXML
    protected void onOperadorClick(ActionEvent event) {
        try {
            num1 = Double.parseDouble(display.getText());
            operador = ((Button) event.getSource()).getText();
            labelHistorial.setText(formatear(num1) + " " + operador);
            inicio = true;
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Calcula el resultado y lo muestra; si se pulsa "=" de nuevo repite la operación
    @FXML
    protected void onIgualClick() {
        if (operador.isEmpty()) return;
        try {
            double num2 = Double.parseDouble(display.getText());
            ultimoNum2 = num2;

            double resultado = model.calcular(operador, num1, num2);

            if (Double.isNaN(resultado)) {
                // Caso especial: división entre cero
                display.setText("No es pot dividir per 0");
            } else {
                // Formatea los números sin .0 innecesario
                String op = formatear(num1) + " " + operador + " " + formatear(num2) + " = " + formatear(resultado);
                display.setText(formatear(resultado));
                labelHistorial.setText(op);
                areaHistorial.appendText(op + "\n");
                num1 = resultado;
            }
            inicio = true;
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    // Cambia el signo del número en pantalla (positivo ↔ negativo)
    @FXML
    protected void onCambiarSignoClick() {
        try {
            double valor = Double.parseDouble(display.getText());
            if (valor == 0) return;
            display.setText(formatear(valor * -1));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Alterna entre mostrar el panel de historial y el panel principal
    @FXML
    protected void toggleHistorial() {
        boolean estaVisible = panelHistorial.isVisible();
        panelHistorial.setVisible(!estaVisible);
        panelHistorial.setManaged(!estaVisible);
        panelPrincipal.setVisible(estaVisible);
        panelPrincipal.setManaged(estaVisible);
    }

    // Borra todo el display y resetea el estado interno de la calculadora
    @FXML
    protected void onBorrarTodoClick() {
        display.setText("0");
        labelHistorial.setText("");
        num1 = 0;
        operador = "";
        inicio = true;
    }

    // Borra todo el historial visual y también el historial interno del Model
    @FXML
    protected void onBorrarHistorialClick() {
        areaHistorial.clear();
        model.limpiarHistorial();
    }

    // Borra el último dígito introducido; si queda uno solo muestra "0"
    @FXML
    protected void onBorrarCifraClick() {
        String t = display.getText();
        display.setText((t.length() > 1) ? t.substring(0, t.length() - 1) : "0");
    }
}