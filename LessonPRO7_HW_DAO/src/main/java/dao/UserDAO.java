package dao;

import interfaces.UserInterface;
import model.User;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements UserInterface {

    static final String CONNECTION_DRIVER = "org.postgresql.Driver";
    static final String CONNECTION_URL = "jdbc:postgresql://localhost/postgres";
    static final String CONNECTION_USER = "postgres";
    static final String CONNECTION_PASSWORD = "estafeta";
    static final String CONNECTION_SQL_GET_ALL = "select * from sys_user";

    @Override
    public List<User> getAll() {
        List<User> userMas = new ArrayList<>();

        try {
            Class.forName(CONNECTION_DRIVER);
            Connection connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD);
            try (PreparedStatement st = connection.prepareStatement(CONNECTION_SQL_GET_ALL)) {
                try (ResultSet set = st.executeQuery()) {
                    while (set.next()) {
                        User user = new User();
                        user.setId(set.getInt("id"));
                        user.setLogin(set.getString("login"));
                        user.setPass(set.getString("pass"));
                        user.setAdmin(set.getBoolean("is_admin"));
                        userMas.add(user);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Failed to create JDBC db connection " + e.toString() + e.getMessage());
        }
        return userMas;
    }

    @Override
    public void deleteById(Serializable id) {

    }
}
