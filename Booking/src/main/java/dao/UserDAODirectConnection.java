package dao;

import interfaces.UserInterface;
import models.User;
import utils.Util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAODirectConnection implements UserInterface {

   Util util = new Util();

    @Override
    public List<User> getAll() {
        List<User> userMas = new ArrayList<>();

        try {
            Class.forName(util.CONNECTION_DRIVER);
            Connection connection = DriverManager.getConnection(util.CONNECTION_URL, util.CONNECTION_USER, util.CONNECTION_PASSWORD);
            try (PreparedStatement st = connection.prepareStatement(util.CONNECTION_SQL_GET_ALL)) {
                try (ResultSet set = st.executeQuery()) {
                    while (set.next()) {
                        User user = new User();
                        user.setId(set.getInt("id"));
                        user.setLogin(set.getString("login"));
                        user.setPassword(set.getString("password"));
                        user.setStatus(set.getInt("status"));
                        userMas.add(user);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Failed to create JDBC db connection " + e.toString() + e.getMessage());
        }
        return userMas;
    }

}


//    create table user_sys (id SERIAL primary key, login VARCHAR(240) not null, password VARCHAR(240), status int not null)
//        insert into user_sys (login, password, status) values('user1', '1', 0)
//        insert into user_sys (login, password, status) values('user2', '2', 1)
//        insert into user_sys (login, password, status) values('user3', '3', 1)