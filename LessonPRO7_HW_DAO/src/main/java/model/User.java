package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {
    private int id;
    private String login;
    private String pass;
    private boolean isAdmin;

    public User() {
    }

    public User(int id, String login, String pass, boolean isAdmin) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.isAdmin = isAdmin;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", isAdmin=" + isAdmin +
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
            if ((element.getLogin().equals(login)) && (element.getPass().equals(password))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isUserAdmin(List<User> userMas, String login) {
        boolean result = false;

        Iterator<User> itr1 = userMas.iterator();
        for (; itr1.hasNext(); ) {
            User element = itr1.next();
            if (element.getLogin().equals(login) && (element.isAdmin() == true)) {
                result = true;
                break;
            }
        }
        return result;
    }

    // static variant FOR TEST!!! need to be deleted!!!!!!!!!!!!!
    public static List<User> getUserStatic() {

        User user1 = new User(1, "user1", "1", true);
        User user2 = new User(2, "user2", "2", false);
        User user3 = new User(3, "user3", "3", false);

        // set ArrayList
        List<User> userMas = new ArrayList<>();
        userMas.add(user1);
        userMas.add(user2);
        userMas.add(user3);

        return userMas;
    }


}