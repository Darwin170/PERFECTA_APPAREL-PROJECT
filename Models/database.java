package Models;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    
    public static Connection DBConnect(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            System.out.println("connected na yung database");
    
            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}