package usuario.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class HelloApplication extends HBox {

    private HelloController controlador;
    private User usuario;

    public HelloApplication() {
        super();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("usuario.fxml"));
            this.controlador = new HelloController();
            fxmlLoader.setController(this.controlador);
            Node node = fxmlLoader.load();
            this.getChildren().add(node);
            this.inicializar();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void inicializar() {
        this.controlador.getGuardar().setOnAction(e ->  {
            System.out.println(usuario.registro());
            this.controlador.getGuardar().getScene().getWindow().hide();
        });

        this.controlador.getSalir().setOnAction(e ->  {
            this.controlador.getSalir().getScene().getWindow().hide();
        });
    }

    public String imprimirRegistro() {
        return usuario.registro();
    }

    public void establecerUsuario(String n, int p) {
        usuario = new User(n, p);
    }

    public void establecerPuntuacion(int n) {
        controlador.getPuntuacion().setText(String.valueOf(n));
    }
}