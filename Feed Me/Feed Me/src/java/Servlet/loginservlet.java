/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.Dbconnector;
import Beans.userbean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Madhuranga
 */
@WebServlet(name = "loginservlet", urlPatterns = {"/loginservlet"})
public class loginservlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request,
    HttpServletResponse response) throws ServletException, IOException {
       
      
        
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
          
        Dbconnector mydb = new Dbconnector();
        mydb.DBconnect();
        
       
        userbean myuserb = new userbean();
      
        
        if(myuserb.isUserExist(user, pass)){
            
        response.sendRedirect("product.jsp");
       
        }
        
        
        
        
        else{
             HttpSession loginsession = request.getSession();
             response.sendRedirect("login.jsp");
        loginsession.setAttribute("status","0");
          
       
        
   
        }
        
        
        
        
        
        
        
    }
    
    
    
    
}