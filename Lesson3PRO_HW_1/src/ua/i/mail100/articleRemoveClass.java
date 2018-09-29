package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class articleRemoveClass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // what is deleted
        int removeId = Integer.parseInt(req.getParameter("removeId"));

        // use session for parameters
        HttpSession session = req.getSession();

        String sessionLogin = (String) session.getAttribute("sessionLogin");
        List<Article> sessionArticleMas = (List<Article>) session.getAttribute("sessionArticleMas");

        // new attributes
        req.setAttribute("articleMas", sessionArticleMas);

        // delete from List
        Iterator<Article> itr = sessionArticleMas.iterator();

        for (; itr.hasNext();) {
            Article element = itr.next();
            if ((element.getId() == removeId) && ((sessionLogin.equals("user1")) || (sessionLogin.equals(element.getUsername()))) ) {
                itr.remove();
            } else {
                req.setAttribute("messageArticleRemove", "You cant remove another's article");
            }
        }

        // go to
        req.getRequestDispatcher("articles.jsp").forward(req, resp);

    }

}
