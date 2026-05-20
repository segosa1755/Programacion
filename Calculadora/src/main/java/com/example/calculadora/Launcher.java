package com.example.calculadora;

import javafx.application.Application;

// Clase de arranque separada de Main para evitar conflictos con el módulo JavaFX
public class Launcher {
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}