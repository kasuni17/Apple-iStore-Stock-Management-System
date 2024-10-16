/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atp;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class DB_Connection {
    public static void main(String[] args){
       try{
            String url="jdbc:mysql://localhost/Apple_iStore";
            String user="root";
            String password="";
            
           Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected!...");
            
        } catch (Exception ex) {
            System.out.println("Erorr : " + ex.getMessage());
        }
        
    }
    }
    

