package sit.int202.pratice.simplepractice.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.pratice.simplepractice.entities.Subject;
import sit.int202.pratice.simplepractice.repositories.SubjectRepository;

import java.io.*;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/subject_list")
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SubjectRepository subjectRepository = new SubjectRepository();
        response.setContentType("text/html");
        SubjectRepository sr = new SubjectRepository();
        List<Subject> ls = sr.findAll();
        request.setAttribute("subjects", ls);
        request.getRequestDispatcher("/subject_listing.jsp").forward(request, response);
        destroy();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 