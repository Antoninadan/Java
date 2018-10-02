package dao;

import interfaces.ArticleInterface;
import interfaces.DAOInterface;
import model.Article;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserInterface implements DAOInterface {


    static final String CONNECTION_DRIVER = "org.postgresql.Driver";
    static final String CONNECTION_URL = "jdbc:postgresql://localhost/postgres";
    static final String CONNECTION_USER = "postgres";
    static final String CONNECTION_PASSWORD = "estafeta";
    static final String CONNECTION_SQL_GET_ALL = "select article.*, sys_user.login from article inner join sys_user on article.user_id = sys_user.id";
    static final String CONNECTION_SQL_DELETE_BY_ID = "delete From article where id = ?";


    @Override
    public List<Article> getAll() {
        List<Article> articleMas = new ArrayList<>();

        try {
            Class.forName(CONNECTION_DRIVER);
            Connection connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD);
            try (PreparedStatement st = connection.prepareStatement(CONNECTION_SQL_GET_ALL)) {
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
        } catch (Exception e) {
            System.out.println("Failed to create JDBC db connection " + e.toString() + e.getMessage());
        }
        return articleMas;
    }


    @Override
    public void deleteById(Serializable id) {
        try {
            Class.forName(CONNECTION_DRIVER);
            Connection connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD);
            try (PreparedStatement st = connection.prepareStatement(CONNECTION_SQL_DELETE_BY_ID)) {
                st.setInt(1, id);
                st.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Failed to create JDBC db connection " + e.toString() + e.getMessage());
        }
    }
}