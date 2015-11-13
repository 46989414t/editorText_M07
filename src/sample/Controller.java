package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class Controller {

    @FXML
    public TextArea contenedorTexto;
    public void sortir(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void copiar(ActionEvent actionEvent) {

        contenedorTexto.copy();
    }

    public void tallar(ActionEvent actionEvent) {
        contenedorTexto.cut();
    }

    public void enganxar(ActionEvent actionEvent) {
        contenedorTexto.paste();
    }

    public void desfer(ActionEvent actionEvent) {
        contenedorTexto.undo();

    }
}
