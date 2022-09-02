package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class sigup implements Initializable {

    @FXML
    private TextField txtgmail;

    @FXML
    private  TextField txtpassword;

    @FXML
    private TextField txtusername;

    public void signin(){
        database connect =new database();
        Connection connectDatabese=connect.getConnection();

        String username=txtusername.getText();
        String gamail =txtgmail.getText();
        String password=txtpassword.getText();

        String query="INSERT INTO signup (username,gmail,upassword) VALUES ('";
        String insert=gamail + "','" + gamail + "' '" +password +" ')";
        String insertoto =query+insert;

        try{
            Statement statement=connectDatabese.createStatement();
            statement.executeQuery(insertoto);

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        signin();
    }
}
