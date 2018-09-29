package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class articleRemoveClass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //req.setAttribute("articleMas", articleMas); // for test


        String removeId = req.getParameter("removeId");

        // use session for parameters
        HttpSession session = req.getSession();

        String sessionLogin = (String) session.getAttribute("sessionLogin");
        Article[] sessionArticleMas = (Article[]) session.getAttribute("sessionArticleMas");

        // new attributes
        req.setAttribute("sessionLogin", sessionLogin);
        req.setAttribute("articleMas", sessionArticleMas);

        // go to
        req.getRequestDispatcher("articles.jsp").forward(req, resp);
    }

}
