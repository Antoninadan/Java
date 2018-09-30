package ua.i.mail100;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Article {
    private int id;
    private String name;
    private String content;
    private String date;
    private String username;

    public Article() {
    }

    public Article(int id, String name, String content, String date, String username) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.date = date;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public static void printMas(List<Article> articleMas) {
        Iterator<ua.i.mail100.Article> itr1 = articleMas.iterator();
        for (; itr1.hasNext(); ) {
            Article element = itr1.next();
            System.out.println(element.toString());
        }
    }

    public static List<Article> articleRemove(List<Article> articleMas, int removeId) {
        Iterator<Article> itr1 = articleMas.iterator();
        for (; itr1.hasNext(); ) {
            Article element = itr1.next();
            if (element.getId() == removeId) {
                itr1.remove();
                break;
            }
        }
        return articleMas;
    }

    public static boolean isArticleCanRemove(List<Article> articleMas, int removeId, List<User> userMas, String login) {
        boolean result = false;

        Iterator<Article> itr1 = articleMas.iterator();
        for (; itr1.hasNext(); ) {
            Article element = itr1.next();
            if ((element.getId() == removeId) && ((User.isUserAdmin(userMas, login)) || (login.equals(element.getUsername()))) ) {
                result = true;
                break;
            }
        }
        return result;
    }


    // static variant FOR TEST!!! need to be deleted!!!!!!!!!!!!!
    public static List<Article> getArticleStatic() {
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

        return articleMas;
    }

    public static List<Article> getArticleDB() throws SQLException {
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
                    }
                }
            }
        }
        return articleMas;
    }

}

