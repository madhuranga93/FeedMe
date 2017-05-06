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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Madhuranga
 */
@WebServlet(name = "AddToCart2", urlPatterns = {"/AddToCart2"})
public class AddToCart2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
            String des = request.getParameter("des");
        String price = request.getParameter("price");
        String qty = request.getParameter("qty");
      
        
        
        Dbconnector mydb = new Dbconnector();
        mydb.DBconnect();
        
       
        cart mysign = new cart();
        if(mysign.insert(des,price,qty)){
        
        response.sendRedirect("pizzahut.jsp");
        
        }
        
        
        
        
        
        
        
        
    }
}
