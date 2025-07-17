package com.learning.sad;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Login servlet accessed");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Login Page</h1>");
        out.println("<p>This is the login section.</p>");
        out.println("<a href='index.html'>Go to Homepage</a>");
    }
}
