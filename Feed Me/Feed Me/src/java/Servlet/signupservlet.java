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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Madhuranga
 */
@WebServlet(name = "signupservlet", urlPatterns = {"/signupservlet"})
public class signupservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
    HttpServletResponse response) throws ServletException, IOException {
        
        String Fname = request.getParameter("name");
        String address = request.getParameter("address");
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        
        Dbconnector mydb = new Dbconnector();
        mydb.DBconnect();
        
       
        userbean mysign = new userbean();
        if(mysign.userlogin(Fname,address,user, pass)){
        
        response.sendRedirect("index.jsp");
        
        }
        
        
        
        
        
    }}


