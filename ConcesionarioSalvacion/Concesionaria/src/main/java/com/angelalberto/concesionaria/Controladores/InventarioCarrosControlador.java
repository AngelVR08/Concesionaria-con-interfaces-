package com.angelalberto.concesionaria.Controladores;

import com.angelalberto.concesionaria.Concesionaria;
import com.angelalberto.concesionaria.models.Carro;
import com.angelalberto.concesionaria.models.ConcesionariaModelo;
import com.angelalberto.concesionaria.models.Moto;
import com.angelalberto.concesionaria.models.Vehiculo;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class InventarioCarrosControlador {

    @FXML
    private TextArea txtArea;
    private Stage stage;
    private ConcesionariaModelo consecionaria;

    @FXML
    void agregarVehiculoClick(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType carro = new ButtonType("Carro");
        ButtonType moto = new ButtonType("Moto");
        alert.getButtonTypes().setAll(carro,moto);
        alert.setTitle("Agregar");
        alert.setHeaderText("El vehiculo es carro o moto?");
        alert.showAndWait().ifPresent(respuesta ->{
            if (respuesta==carro){
                Carro newCarro = new Carro();
                TextInputDialog dialog = new TextInputDialog();
                dialog.setTitle("Agregar Vehiculoo");
                dialog.setHeaderText("Modelo del carro:");
                Optional<String> result = dialog.showAndWait();
                result.ifPresent(newCarro::setModelo);
                dialog.setHeaderText("Placa del carro:");
                Optional<String> placa= dialog.showAndWait();
                placa.ifPresent(newCarro::setPlaca);
                dialog.setHeaderText("Color del vehiculo:");
                Optional<String> color = dialog.showAndWait();
                color.ifPresent(newCarro::setColor);
                dialog.setHeaderText("Fecha de publicacion del vehiculo:");
                Optional<String> fecha = dialog.showAndWait();
                fecha.ifPresent(newCarro::setFechaDePublicacion);
                dialog.setHeaderText("Cantidad de pasajeros del vehiculo:");
                Optional<String> cantidad = dialog.showAndWait();
                cantidad.ifPresent(newCarro::setCantidadDePasajeros);
                dialog.setHeaderText("Puertas del vehiculo:");
                Optional<String> puertas = dialog.showAndWait();
                puertas.ifPresent(newCarro::setNumeroDePuertas);
                consecionaria.agregarVehiculos(newCarro);
            } else {
                Moto newMoto = new Moto();
                TextInputDialog dialog = new TextInputDialog();
                dialog.setTitle("Agregar Vehiculoo");
                dialog.setHeaderText("Modelo del carro:");
                Optional<String> result = dialog.showAndWait();
                result.ifPresent(newMoto::setModelo);
                dialog.setHeaderText("Placa del carro:");
                Optional<String> placa= dialog.showAndWait();
                placa.ifPresent(newMoto::setPlaca);
                dialog.setHeaderText("Color del vehiculo:");
                Optional<String> color = dialog.showAndWait();
                color.ifPresent(newMoto::setColor);
                dialog.setHeaderText("Fecha de publicacion del vehiculo:");
                Optional<String> fecha = dialog.showAndWait();
                fecha.ifPresent(newMoto::setFechaDePublicacion);
                dialog.setHeaderText("Cilindros vehiculo:");
                Optional<String> cilindros = dialog.showAndWait();
                cilindros.ifPresent(newMoto::setCilindros);
                consecionaria.agregarVehiculos(newMoto);
            }
        });
        actualizarTextoArea();
    }

    @FXML
    void eliminarVehiculoClick(MouseEvent event) {
        var ref = new Object() {
            int eli;
            boolean encontrado = false;
            int i = 0;
        };
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Eliminar vehiculo");
        dialog.setHeaderText("Placa del vehiculo a eliminar");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(eliminar->{
            for (Vehiculo vehiculo: consecionaria.getListaVehiculos()){
                if (vehiculo.getPlaca().equals(eliminar)){
                    ref.eli = ref.i;
                    ref.encontrado = true;
                }
                ref.i++;
            }
        });
        if (ref.encontrado){
            consecionaria.getListaVehiculos().remove(ref.eli);
        }
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
        txtArea.setText(consecionaria.imprimirVehiculos());
    }

}