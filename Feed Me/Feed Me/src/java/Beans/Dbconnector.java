/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Madhuranga
 */
public class Dbconnector {
    
    Connection con;
    
    public Connection DBconnect(){
   
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feed?","root","");
            
        } catch (Exception e) {
        }
        
     
     
           return con;
    }  
}

