package sit.int202.practice.sitspacemanagement.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.practice.sitspacemanagement.model.AllStudent;
import sit.int202.practice.sitspacemanagement.model.Student;

import java.io.*;

@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String scoreText = request.getParameter("score");
        if (id != null & name != null & scoreText != null) {
            int score = Integer.parseInt(scoreText);
            AllStudent allStudent = (AllStudent) session.getAttribute("allStudent");
            if (allStudent == null) {
                allStudent = new AllStudent();
                session.setAttribute("allStudent", allStudent);
                System.out.println("------Create new allStudent");
            }
            Student std = new Student(id, name, score);
            boolean check = allStudent.add(std);
            String message;
            if (check) {
                message = "Add successful";
            } else {
                message = "Add not successful";
            }
            session.setAttribute("message", message);
            System.out.println("-------------Number of Student: " + allStudent.getAllData().size());
        }
        request.getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 