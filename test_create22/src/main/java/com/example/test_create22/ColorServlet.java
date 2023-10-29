package com.example.test_create22;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name="ColorServlet",value = "/color-servlet")
public class ColorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color_name = req.getParameter("color");
        Cookie color = new Cookie("color",color_name);
        resp.addCookie(color);
        resp.sendRedirect("index.jsp");
    }
}
