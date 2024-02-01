package org.example.corsoservlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Welcome to the first Java Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String city = request.getParameter("cityname");
        out.println("<html><body>");
        out.println("<h1>" + name + "</h1>");
        out.println("<h1>" + city + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String city = req.getParameter("cityname");
        out.println("<html><body>");
        out.println("<h1>" + name + "</h1>");
        out.println("<h1>" + city + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}