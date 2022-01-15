package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewProfileController implements Initializable {
    @FXML
    private Group group;

    @FXML
    private Label nameLBL;

    @FXML
    private Label BioLBL;

    @FXML
    private TextArea nameText;

    @FXML
    private TextArea bioText;

    @FXML
    private Button exitBTN;

    @FXML
    private Label editLBL;

    @FXML
    private Button EditBTN;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameText.setText(MainPageController.saveName);
        bioText.setText(MainPageController.saveBio);
        editLBL.setText("");
        exitBTN.setOnAction(event -> exit());
        EditBTN.setOnAction(event -> EditProfile());



    }
    public void exit(){
        ((Stage)exitBTN.getScene().getWindow()).close();

    }
    public void EditProfile(){
        MainPageController.saveName = nameText.getText();
        MainPageController.saveBio = bioText.getText();
        editLBL.setText("Profile edited successfully");
        editLBL.setTextFill(Paint.valueOf(("#208a27")));

    }
}
