package com.angelalberto.concesionaria.Controladores;

import com.angelalberto.concesionaria.Concesionaria;
import com.angelalberto.concesionaria.models.ConcesionariaModelo;
import com.angelalberto.concesionaria.models.Empleado;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class ListaEmpleadosControlador {

    @FXML
    private TextArea txtArea;
    private Stage stage;
    private ConcesionariaModelo consecionaria;

    @FXML
    void agregarEmpleadoClick(MouseEvent event) {
        Empleado newEmpleado = new Empleado();
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Agregar Empleado");
        dialog.setHeaderText("Nombre del nuevo empleado");
        Optional<String> nombre = dialog.showAndWait();
        nombre.ifPresent(newEmpleado::setNombre);
        dialog.setHeaderText("Edad del empleado");
        Optional<String> edad = dialog.showAndWait();
        edad.ifPresent(newEmpleado::setEdad);
        consecionaria.agregarEmpleado(newEmpleado);
        actualizarTextoArea();
    }


    @FXML
    void salirClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Concesionaria.class.getResource("MenuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ConcesionariaModelo");
        stage.setScene(scene);
        stage.show();
        MenuPrincipalControlador menuPrincipalControlador = fxmlLoader.getController();
        menuPrincipalControlador.setStage(stage);
        menuPrincipalControlador.actualizar(consecionaria);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setConcecionaria(ConcesionariaModelo concesionaria) {
        this.consecionaria = concesionaria;
    }
    public void actualizarTextoArea(){
        txtArea.setText(consecionaria.imprimirEmpleado());
    }
}
