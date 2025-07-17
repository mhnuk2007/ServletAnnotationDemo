package com.learning.sad;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("In MyServlet service() method");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from MyServlet!</h1>");
        out.println("<a href='index.html'>Go to Homepage</a>");
    }
}
