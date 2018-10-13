package controllers;

import dao.UserDAODirectConnection;
import dao.UserDAOHibernate;
import models.User;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class LoginController extends HttpServlet {

//    private UserDAODirectConnection userDAO = new UserDAODirectConnection();
    private UserDAOHibernate userDAO = new UserDAOHibernate();
    private UserService userService = new UserService(userDAO);
    private List<User> userMas = userService.getAll();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        //  TEST  static data !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        List<User> userMas = new ArrayList<>();
//        userMas = User.getUserStatic();

        User.printMas(userMas);

        // check password
        Iterator<User> itr = userMas.iterator();
        if (User.isUserCorrect(userMas, login, password)) {

//            req.setAttribute("articleMas", articleMas);
            // session
            HttpSession session = req.getSession();
            session.setAttribute("sessionLogin", login);
            session.setAttribute("sessionPassword", password);

            req.getRequestDispatcher("bilets.jsp").forward(req, resp);

        } else {
            req.setAttribute("message", "Wrong user or password");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

    }
}
