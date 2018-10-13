package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
@Table(name = "user_sys")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String login;
    private String password;
    private int status; // 0 - not approved, 1 - approved

    public User() {
    }

    public User(int id, String login, String password, int status) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.status = status;
    }


    public User(String login, String password, int status) {
        this.login = login;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + password + '\'' +
                ", status=" + status +
                '}';
    }

    public static void printMas(List<User> userMas) {
        Iterator<User> itr1 = userMas.iterator();
        for (; itr1.hasNext(); ) {
            User element = itr1.next();
            System.out.println(element.toString());
        }
    }

    public static boolean isUserCorrect(List<User> userMas, String login, String password) {
        boolean result = false;

        Iterator<User> itr1 = userMas.iterator();
        for (; itr1.hasNext(); ) {
            User element = itr1.next();
            if ((element.getLogin().equals(login)) && (element.getPassword().equals(password)) && (element.getStatus() == 1)) {
                result = true;
                break;
            }
        }
        return result;
    }


    // static variant FOR TEST!!! need to be deleted!!!!!!!!!!!!!
    public static List<User> getUserStatic() {

        User user1 = new User(1, "user1", "1", 0);
        User user2 = new User(2, "user2", "2", 1);
        User user3 = new User(3, "user3", "3", 1);

        // set ArrayList
        List<User> userMas = new ArrayList<>();
        userMas.add(user1);
        userMas.add(user2);
        userMas.add(user3);

        return userMas;
    }


}