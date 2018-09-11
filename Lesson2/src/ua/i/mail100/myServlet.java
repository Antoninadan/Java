package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class myServlet extends HttpServlet {

    static final String TEMPLATE = "<html><head><title>Title</title></head><body><h1>%s</h1></body></html>";

    // download library from https://mvnrepository.com/artifact/javax.servlet/servlet-api/2.5 (jar). Copy jar someplace
    // add library (project Structure)
    // Servlet write to web.xml <servlet>, <servlet-mapping>

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        System.out.println("to console");

        PrintWriter pw = resp.getWriter();

        pw.println("to content");

        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
       // pw.println("a+b = " + (a + b));

        pw.println(String.format(TEMPLATE, "a+b = " + (a + b)));


//        resp.setContentType("application/json");  // dont work
//        String jsonExample = "{\"title\":\"Конференция\",\"date\":\"2014-11-30T12:00:00.000Z\"}";
//        pw.println(jsonExample);

//        resp.setStatus(400);



    }
}
