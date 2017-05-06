/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.Dbconnector;
import Beans.cart;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Madhuranga
 */
@WebServlet(name = "RemoveFromCart", urlPatterns = {"/RemoveFromCart"})
public class RemoveFromCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        String des = request.getParameter("des");
       
         Connection con;
    Statement stmt;
    
    
    
    Dbconnector mydb = new Dbconnector();
    con=mydb.DBconnect();
            
    
    cart mysign = new cart();
        if(mysign.remove(des)){
        
        response.sendRedirect("cart.jsp");
        
        }
        
        
    }
        
}
