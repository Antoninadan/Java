package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
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

        // read info
          // get articles from DB
        List<Article> articleMas = new ArrayList<>();
        articleMas = Article.getArticleDB();

        // get users from DB
        List<User> userMas = new ArrayList<>();
        userMas = User.getUserDB();

        //  TEST !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        List<Article> articleMas = new ArrayList<>();
//        articleMas = Article.getArticleStatic();
//
//        List<User> userMas = new ArrayList<>();
//        userMas = User.getUserStatic();

        // delete from List

            if (Article.isArticleCanRemove(articleMas, removeId, userMas, sessionLogin)) {
                        req.setAttribute("articleMas", Article.articleRemove(articleMas, removeId));
            } else {
                req.setAttribute("articleMas", articleMas);
                req.setAttribute("messageArticleRemove", "You cant remove another's article");
            }

        // go to
        req.getRequestDispatcher("articles.jsp").forward(req, resp);

    }

}
