package usuario.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField nombre;

    @FXML
    private Label puntuacion;

    @FXML
    private Button guardar;

    @FXML
    private Button salir;


    public TextField getNombre() {
        return nombre;
    }

    public void setNombre(TextField nombre) {
        this.nombre = nombre;
    }

    public Label getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Label puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Button getGuardar() {
        return guardar;
    }

    public void setGuardar(Button guardar) {
        this.guardar = guardar;
    }

    public Button getSalir() {
        return salir;
    }

    public void setSalir(Button salir) {
        this.salir = salir;
    }
}