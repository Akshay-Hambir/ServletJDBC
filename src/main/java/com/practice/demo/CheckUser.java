package com.practice.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/logincheck")
public class CheckUser extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user = request.getParameter("txtUser");
        String pass = request.getParameter("txtPassword");
        PrintWriter out = response.getWriter();
        Validate ref = new Validate();
        try {
            if(ref.isValidUser(user,pass)==true){
                RequestDispatcher rd = request.getRequestDispatcher("home.html");
                rd.forward(request,response);
            }
            else{
                request.setAttribute("fresh","false");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request,response);
            }
        } catch (ClassNotFoundException | SQLException | ServletException e) {
            e.printStackTrace();
            out.println("exception" + e.getMessage());
        }
    }
}
