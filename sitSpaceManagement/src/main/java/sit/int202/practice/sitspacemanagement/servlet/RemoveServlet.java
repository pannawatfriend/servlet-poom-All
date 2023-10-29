package sit.int202.practice.sitspacemanagement.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.practice.sitspacemanagement.model.AllStudent;

import java.io.*;

@WebServlet(name = "RemoveServlet", value = "/RemoveServlet")
public class RemoveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String id = request.getParameter("id");
        if (id != null) {
            String message;
            AllStudent allStudent = (AllStudent) session.getAttribute("allStudent");
            if (allStudent != null) {
                boolean check = allStudent.remove(id);
                if (check) {
                    message = "Remove Successful";
                } else {
                    message = "Remove not Successful";
                }
            } else {
                message = "Remove not Successful";
            }
            session.setAttribute("message", message);
        }
        request.getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 