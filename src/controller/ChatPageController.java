package controller;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChatPageController implements Initializable {
    @FXML
    private VBox chatVbox;

    @FXML
    private HBox profileHbox;

    @FXML
    private ImageView profile;

    @FXML
    private Label nameLBL;

    @FXML
    private HBox HboxMessage;

    @FXML
    private Label PmLBL;

    @FXML
    private Button closeBTN;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
