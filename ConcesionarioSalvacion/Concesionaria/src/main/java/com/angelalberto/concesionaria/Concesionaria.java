package com.angelalberto.concesionaria;

import com.angelalberto.concesionaria.Controladores.MenuPrincipalControlador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Concesionaria extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Concesionaria.class.getResource("MenuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Concesionaria");
        stage.setScene(scene);
        stage.show();
        MenuPrincipalControlador menuPrincipalControlador = fxmlLoader.getController();
        menuPrincipalControlador.setStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}