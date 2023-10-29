package sit.int202.simplefri.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.simplefri.entities.Subject;
import sit.int202.simplefri.repositories.SubjectRepository;

import java.io.*;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/subject-list")
public class SubjectListServlet extends HttpServlet {
    private long startTime;

    @Override
    public void destroy() {
        System.out.println("----------------------------");
        System.out.println("Duration of SubjectListServlet is " +
                (System.currentTimeMillis() - startTime) + "milli seconds");
        System.out.println("----------------------------");
    }

    @Override
    public void init() throws ServletException {
        startTime = System.currentTimeMillis();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SubjectRepository subjectRepository = new SubjectRepository();
        response.setContentType("text/html");
        SubjectRepository sr = new SubjectRepository();
        List<Subject> ls = sr.findAll();
        request.setAttribute("subjects", ls);
        request.getRequestDispatcher("/subject-list.jsp").forward(request, response);
        destroy();

//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>Subject List::</h1></hr>");
//        for (Subject s : subjectRepository.findAll()) {
//            out.println(s.getId());
//            out.println(" ");
//            out.println(s.getTitle());
//            out.println(" ");
//            out.println(s.getCredit());
//            out.println("</br> ");
//        }
//        out.println("</hr>");
//
//
//        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
