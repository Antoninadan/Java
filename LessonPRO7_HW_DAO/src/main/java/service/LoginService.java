package service;

import dao.ArticleDAO;
import dao.UserDAO;
import interfaces.ArticleInterface;
import model.Article;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoginService extends HttpServlet {

    private ArticleDAO articleDAO = new ArticleDAO();
    private ArticleService  articleService = new ArticleService(articleDAO);
    private List<Article> articleMas = articleService.getAll();

    private UserDAO userDAO = new UserDAO();
    private UserService  userService = new UserService(userDAO);
    private List<User> userMas = userService.getAll();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        //  TEST  static data !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        List<Article> articleMas = new ArrayList<>();
//        articleMas = Article.getArticleStatic();
//        List<User> userMas = new ArrayList<>();
//        userMas = User.getUserStatic();


        Article.printMas(articleMas);
        User.printMas(userMas);

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
