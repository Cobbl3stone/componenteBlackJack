module usuario.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens usuario.demo to javafx.fxml;
    exports usuario.demo;
}