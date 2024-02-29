package com.angelalberto.concesionaria.Controladores;

import com.angelalberto.concesionaria.Concesionaria;
import com.angelalberto.concesionaria.models.ConcesionariaModelo;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipalControlador {

    ConcesionariaModelo concesionaria = new ConcesionariaModelo();
    private Stage stage;

    @FXML
    void InventarioClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Concesionaria.class.getResource("InventarioCarros.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Concesionaria");
        stage.setScene(scene);
        stage.show();
        InventarioCarrosControlador inventarioCarrosControlador = fxmlLoader.getController();
        inventarioCarrosControlador.setStage(stage);
        inventarioCarrosControlador.setConcecionaria(concesionaria);
        inventarioCarrosControlador.actualizarTextoArea();
    }

    @FXML
    void listaEmpleadosClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Concesionaria.class.getResource("ListaEmpleados.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Concesionaria");
        stage.setScene(scene);
        stage.show();
        ListaEmpleadosControlador listaEmpleadosControlador = fxmlLoader.getController();
        listaEmpleadosControlador.setStage(stage);
        listaEmpleadosControlador.setConcecionaria(concesionaria);
        listaEmpleadosControlador.actualizarTextoArea();
    }

    @FXML
    void cerrarClick(MouseEvent event) {
        stage.close();
    }

    public void actualizar(ConcesionariaModelo concesionaria){
        this.concesionaria = concesionaria;
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

}
