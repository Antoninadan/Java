package controllers;

import dao.ArticleDAO;
import dao.UserDAO;
import models.Article;
import models.User;
import services.ArticleService;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ArticleRemoveController extends HttpServlet {

    private ArticleDAO articleDAO = new ArticleDAO();
    private ArticleService articleService = new ArticleService(articleDAO);
    private List<Article> articleMas = articleService.getAll();

    private UserDAO userDAO = new UserDAO();
    private UserService userService = new UserService(userDAO);
    private List<User> userMas = userService.getAll();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // what is deleted
        int removeId = Integer.parseInt(req.getParameter("removeId"));

        // use session for parameters
        HttpSession session = req.getSession();

        String sessionLogin = (String) session.getAttribute("sessionLogin");

        //  TEST  static data !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        List<Article> articleMas = new ArrayList<>();
//        articleMas = Article.getArticleStatic();
//
//        List<User> userMas = new ArrayList<>();
//        userMas = User.getUserStatic();

        // delete from List

        if (Article.isArticleCanRemove(articleMas, removeId, userMas, sessionLogin)) {
            articleService.deleteById(removeId);
            req.setAttribute("articleMas", Article.articleRemove(articleMas, removeId));
        } else {
            req.setAttribute("articleMas", articleMas);
            req.setAttribute("messageArticleRemove", "You cant remove another's article");
        }

        // go to
        req.getRequestDispatcher("articles.jsp").forward(req, resp);

    }

}
