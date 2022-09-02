package com.example.demo1;

import java.sql.DriverManager;
import java.sql.*;

public class database {
    public  Connection databaselink;

    public Connection getConnection(){
        String databaseName="";
        String databeseUser="";
        String databasePassword="";
        String url="jdbc:mysql://localhost:3306/"+databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink=DriverManager.getConnection(url,databeseUser,databasePassword);

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return databaselink;

    }
}
