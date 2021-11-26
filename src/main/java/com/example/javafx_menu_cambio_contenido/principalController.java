package com.example.javafx_menu_cambio_contenido;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;

public class principalController {


    @FXML
    private MenuItem miGestionProductos;
    @FXML
    private VBox vbPrincipal;

    @FXML
    public void onGestionProductosAction(Event actionEvent) {
        URL fxmlUrl = this.getClass()
                .getResource("productos.fxml");


        // Load the Label for default Locale
        try {
            if (vbPrincipal.getChildren().size() > 1) {
                vbPrincipal.getChildren().remove(1);
            }
            vbPrincipal.getChildren().add(FXMLLoader.load(fxmlUrl));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}