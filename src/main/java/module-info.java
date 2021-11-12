module com.example.javafx_menu_cambio_contenido {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_menu_cambio_contenido to javafx.fxml;
    exports com.example.javafx_menu_cambio_contenido;
}