package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button button;
    @FXML
    private Label dispLabel;

    @FXML
    void disp() {
        dispLabel.setText("works!");
    }

}
