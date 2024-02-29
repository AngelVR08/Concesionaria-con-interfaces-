module com.angelalberto.concesionaria {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.angelalberto.concesionaria to javafx.fxml;
    exports com.angelalberto.concesionaria;
    exports com.angelalberto.concesionaria.Controladores;
    opens com.angelalberto.concesionaria.Controladores to javafx.fxml;
}