package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import model.User;
import sun.security.pkcs11.P11Util;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {
    @FXML
    private AnchorPane anchorpane;

    @FXML
    private HBox hbox;

    @FXML
    private VBox vbox;

    @FXML
    private ImageView image;

    @FXML
    private Button viewProfile;

    @FXML
    private Button createGroup;

    @FXML
    private Button createChannel;

    @FXML
    private Button exit;

    @FXML
    private TextField userNameField;

    @FXML
    private Button searchBTN;
    @FXML
    private Label errorLBL;
    static String nameUser;

    static String usernameChannel , saveName , saveBio;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errorLBL.setText("");
        viewProfile.setOnAction(event -> {
            try {
                viewProfile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        exit.setOnAction(event -> Exit());
        createChannel.setOnAction(event -> {
            try {
                openCreateChannelPage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        createGroup.setOnAction(event -> {
            try {
                openCreateGroupPage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        searchBTN.setOnAction(event -> {
            try {
                openChatPage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });



    }
    public void Exit(){
        ((Stage)exit.getScene().getWindow()).close();

    }
    public void viewProfile() throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("../view/ViewProfile.fxml"));
        Stage profileStage =new Stage();
        profileStage.setTitle(" Profile");
        profileStage.setScene(new Scene(root));
        profileStage.show();

    }
    public void openCreateChannelPage() throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("../view/CreateChannel.fxml"));
        Stage channel = new Stage();
        channel.setTitle("Create channel");
        channel.setScene(new Scene(root));
        channel.show();
    }
    public void openCreateGroupPage() throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("../view/CreateGroup.fxml"));
        Stage group = new Stage();
        group.setTitle("Create group");
        group.setScene(new Scene(root));
        group.show();
    }
    public boolean findUser(){
        User user1 = new User();
        for (int i = 0; i < user1.getUserArrayList().size(); i++) {
            if (userNameField.getText().equals(user1.getUserArrayList().get(i).getUserName())){
                nameUser=user1.getUserArrayList().get(i).getUserName();
                return true;
            }
        }
        return false;
    }
    public void openChatPage() throws IOException {
        if (findUser()) {
            BorderPane root = FXMLLoader.load(getClass().getResource("../view/ChatPage.fxml"));
            Stage chatPage = new Stage();
            chatPage.setTitle("");
            chatPage.setScene(new Scene(root));
            chatPage.show();
        }
        else {
            errorLBL.setText("user not found !!");
            errorLBL.setAlignment(Pos.CENTER);
            errorLBL.setTextFill(Paint.valueOf(("#FF0000")));

        }
    }

}
