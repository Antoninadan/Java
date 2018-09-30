
/*we have articles by different users

users can delete articles (admin can delete all articles; NOT admin can delete only OWN articles)

we have users with passwords
* login: "user1" password "1"  // this is admin! can delete all articles
* login: "user2" password "2"  // can delete only OWN articles
* login: "user3" password "3"  // can delete only OWN articles*/


package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mainClass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Main");

        List<Article> articleMas = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "estafeta")) {
            try (PreparedStatement st = connection.prepareStatement("select article.*, sys_user.login from article inner join sys_user on article.user_id = sys_user.id")) {

                try (ResultSet set = st.executeQuery()) {
                    while (set.next()) {
                        Article article = new Article();
                        article.setId(set.getInt("id"));
                        article.setName(set.getString("name"));
                        article.setContent(set.getString("content"));
                        article.setDate(set.getString("date"));
                        article.setUsername(set.getString("login"));
                        articleMas.add(article);
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + articleMas.toString());
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("error ResultSet");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("error PreparedStatement");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error Connection");
        }




    }

}
