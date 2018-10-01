package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class loginClass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

//        // get articles from DB
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


        // check password
        Iterator<User> itr = userMas.iterator();
        if (User.isUserCorrect(userMas, login, password)) {

            req.setAttribute("articleMas", articleMas);
            // session
            HttpSession session = req.getSession();
            session.setAttribute("sessionLogin", login);
            session.setAttribute("sessionPassword", password);

            req.getRequestDispatcher("articles.jsp").forward(req, resp);

        } else {
            req.setAttribute("message", "Wrong user or password");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

    }
}


