package com.practice.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class Auth extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("txtUser");
        PrintWriter out = response.getWriter();

        out.println("<h1>" + username + "</h1>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("txtUser");
        PrintWriter out = response.getWriter();

        out.println("<h1>" + username + "</h1>");

    }
}