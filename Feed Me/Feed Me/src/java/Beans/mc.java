/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Madhuranga
 */
public class mc {
    private String des;
    private String price;
    private String qty;
    
    
    Connection con;
    Statement stmt;
    
    public mc(){
    
    Dbconnector mydb = new Dbconnector();
    con=mydb.DBconnect();
   
    }
    
    
         public boolean insert(String m,String n,String u){
         
    
        boolean flag=false;
          
          
         try {
            String sq= "INSERT INTO cart (des,price,qty) values ('"+m+"','"+n+"','"+u+"')";
            
            Statement pst=con.prepareStatement(sq);
             
            pst.execute(sq);
            flag = true;
         } catch (Exception e) {
             
         }
        
         
         return flag;
     }
}
