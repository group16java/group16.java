package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
   @FXML
    private Button nextButton;

    @FXML
    private Button logout;

   @FXML
   private Button finishButton;

   @FXML
   private Button secondNextButton;

   @FXML
   private Button signinNextButton;

   @FXML
   private Button signupbutton;





   public void firstInterface() throws IOException {

           Stage stage = (Stage) signinNextButton.getScene().getWindow();
           stage.close();
           Stage primaryStage = new Stage();
           Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("second.fxml")));
           primaryStage.setTitle("Student Portal");
           primaryStage.setScene(new Scene(root, 600, 600));
           primaryStage.show();

   }
    public void signup() throws IOException {
        Stage stage = (Stage) signupbutton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("signup.fxml")));
        primaryStage.setTitle("Student Portal");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();


    }


    public void secondInterface() throws IOException {

        Stage stage = (Stage) secondNextButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Transcript.fxml")));
        primaryStage.setTitle("Student Portal");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();

    }
    public void thirdInterface() throws IOException {

        Stage stage = (Stage) finishButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("done.fxml")));
        primaryStage.setTitle("Student Portal");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }

    public void logout() throws IOException {

        Stage stage = (Stage) logout.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        primaryStage.setTitle("Student Portal");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }



}