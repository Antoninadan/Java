package ua.i.mail100;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class calcServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            double paramA = Double.parseDouble(req.getParameter("a"));
            double paramB = Double.parseDouble(req.getParameter("b"));
            String operation = req.getParameter("operation");

            resp.getWriter().println("a " + operation + "b = " + calc(paramA, paramB, operation));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (WrongOperationException e) {
            resp.getWriter().println(e.getMessage());
        }

    }

    public double calc(double paramA, double paramB, String operation) throws WrongOperationException, ArithmeticException {

        switch (operation) {
            case "add":
                return (paramA + paramB);
            case "deduct":
                return (paramA - paramB);
            case "divide":
                return (paramA / paramB);
            case "multiply":
                return (paramA * paramB);
            default:
                throw new WrongOperationException();
        }
    }
}