package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class loginClass extends HttpServlet {

    private Map<String, String> users = new HashMap<>();

    {
        users.put("user1", "1"); // this is admin! can delete all articles
        users.put("user2", "2"); // can delete only OWN articles
        users.put("user3", "3"); // can delete only OWN articles
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (users.containsKey(login) && users.get(login).equals(password)) {

            String content1 = "Mercedes driver Lewis Hamilton produced one of the best laps of his career to take a surprise pole position for the Singapore Grand Prix.";
            String content2 = "Navigating a new place can be challenging no matter where in the world it is, but these five cities make day-to-day living a lot easier than others.";
            String content3 = "Plenty of actors make music and, in most cases, it doesn't seem so unexpected";
            String content4 = "uhourhgodgodfo";
            String content5 = "54674";

            Article articleMas0 = new Article(1, "Hamilton takes stunning pole in Singapore", content1, "12.12.2017", "user1");
            Article articleMas1 = new Article(2, "The cities than make living easy", content2, "12.12.2017", "user2");
            Article articleMas2 = new Article(3, "6 of the weirdest albums released by Hollywood stars", content3, "12.12.2017", "user3");
            Article articleMas3 = new Article(4, "dgfhgdfhdf", content3, "12.01.2018", "user3");
            Article articleMas4 = new Article(5, "fghf", content3, "11.09.2018", "user3");

            // set ArrayList
            List<Article> articleMas = new ArrayList<>();
            articleMas.add(articleMas0);
            articleMas.add(articleMas1);
            articleMas.add(articleMas2);
            articleMas.add(articleMas3);
            articleMas.add(articleMas4);

            req.setAttribute("articleMas", articleMas);

            req.getRequestDispatcher("articles.jsp").forward(req, resp);

            // session
            HttpSession session = req.getSession();
            session.setAttribute("sessionLogin", login);
            session.setAttribute("sessionPassword", password);
            session.setAttribute("sessionArticleMas", articleMas);

        } else {
            req.setAttribute("message", "Wrong user or password");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }


    }

}
