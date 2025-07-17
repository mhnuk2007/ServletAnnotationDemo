package com.learning.sad;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/about")
public class About extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("About servlet accessed");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>About Page</h1>");
        out.println("<p>This is a demo annotation-based servlet application.</p>");
        out.println("<a href='index.html'>Go to Homepage</a>");
    }
}
