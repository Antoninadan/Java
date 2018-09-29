
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
import java.util.HashMap;
import java.util.Map;

public class mainClass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

}
