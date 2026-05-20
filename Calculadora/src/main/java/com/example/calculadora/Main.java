package com.example.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Clase principal que arranca la aplicación JavaFX y carga la interfaz
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // Carga el archivo FXML que define la interfaz visual
        FXMLLoader fxmlLoader =
                new FXMLLoader(Main.class.getResource("calculadora.fxml"));

        // Crea la ventana con tamaño inicial 350x600
        Scene scene = new Scene(fxmlLoader.load(), 350, 600);

        // Tamaño mínimo para que el diseño no se rompa al redimensionar
        stage.setMinWidth(280);
        stage.setMinHeight(500);

        // Aplica el archivo de estilos CSS
        scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());

        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}