package com.example.test_create22;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Jid!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        HttpSession hs = request.getSession();
//        hs.setAttribute("color","red");

        Student a = new Student(1,"jid");
        Cookie id = new Cookie("jid_id",a.getId() + "");
        Cookie name = new Cookie("jid_name",a.getName());
        response.addCookie(id);
        response.addCookie(name);
        response.sendRedirect("std.jsp");
    }

    public void destroy() {
    }
}