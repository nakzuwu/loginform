/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class koneksi {
    public static void main(String args[]){  
        try {
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Succeed Load Driver ..");
    }catch (ClassNotFoundException ex ){
    System.out.println("error"+ex);
}
   try {
       String url = "jdbc:mysql://localhost:3306/login";
       Connection connect= (Connection) DriverManager.getConnection(url,"root","");
       System.out.println("Success Connect To Database");
    }catch(SQLException e){
        System.out.println("error"+e);
    }
          
        }  
    
}
