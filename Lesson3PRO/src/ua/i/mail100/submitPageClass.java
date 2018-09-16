package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class submitPageClass extends HttpServlet {

    private Map<String, String> users = new HashMap<>();

    {
        users.put("admin", "admin");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if(users.containsKey(login) && users.get(login).equals(password)) {
            req.getRequestDispatcher("result.jsp").forward(req, resp);
        } else {
            req.setAttribute("message", "Wrong password");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

        HttpSession session = req.getSession();
        session.setAttribute("login", login);
        session.setAttribute("password", password);
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        resp.getOutputStream().println(session.getAttribute("login") + "  "+  session.getAttribute("password"));
    }
}
