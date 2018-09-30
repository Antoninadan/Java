import java.sql.*;
import java.util.Iterator;
import java.util.List;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


// class with setter, getter
class City {

    private long id;
    private String name;
    private long countryId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                '}';
    }
}


public class Main {

    public static void main(String[] args) throws SQLException {
//        getCitiesSimple();

//        System.out.println(getCitiesByCountry("Ukraine"));

        Iterator<ua.i.mail100.Article> itr = getArticle().iterator();
        for (; itr.hasNext(); ) {
            ua.i.mail100.Article element = itr.next();
            System.out.println(element.toString());
        }

    }

    // simple example
    private static void getCitiesSimple() throws SQLException {
        // add PostgreSQL JDBC Driver
        // default user = "postgres"
        // try-catch with resources
        // Connection -> PreparedStatement -> ResultSet = PreparedStatement.executeQuery()

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "estafeta")) {
            try (PreparedStatement st = c.prepareStatement("select * From city")) {
                try (ResultSet set = st.executeQuery()) {
                    while (set.next()) {
                        System.out.println(set.getString("name"));
                    }
                }
            }
        }
    }


    // example
    private static List<City> getCitiesByCountry(String countryName) throws SQLException {
        List<City> cities = new ArrayList<>();

        // default user = "postgres"
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "estafeta")) {
            try (PreparedStatement st = c.prepareStatement("select * From city where country_id = (select id from country where name = ?)")) {
//                // addBatch
//                st.addBatch("insert into ... ");
//                st.addBatch("insert into ... ");

                // insert parameter
                st.setString(1, countryName);
//                st.setString(2, cbcklkldlk); // if more then one ?

                try (ResultSet set = st.executeQuery()) {
                    while (set.next()) {
                        City city = new City();
                        city.setName(set.getString("name"));
                        city.setId(set.getInt("id"));
                        city.setCountryId(set.getInt("country_id"));
                        cities.add(city);
                    }
                }
            }
        }
        return cities;
    }


    private static List<ua.i.mail100.Article> getArticle() throws SQLException {
        List<ua.i.mail100.Article> articleMas = new ArrayList<>();


        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "estafeta")) {
            try (PreparedStatement st = connection.prepareStatement("select article.*, sys_user.login from article inner join sys_user on article.user_id = sys_user.id")) {

                try (ResultSet set = st.executeQuery()) {
                    while (set.next()) {
                        ua.i.mail100.Article article = new ua.i.mail100.Article();
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


    private static void createTables() throws SQLException {

        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "estafeta")) {
            try (PreparedStatement st = connection.prepareStatement("CREATE TABLE IF NOT EXISTS sys_user2(id SERIAL PRIMARY KEY, login varchar(255), pass varchar(255), is_admin boolean)")) {
            }
            try (PreparedStatement st = connection.prepareStatement("CREATE TABLE IF NOT EXISTS article2(id SERIAL PRIMARY KEY, name varchar(255), content varchar(255), date varchar(255), user_id int NOT NULL, FOREIGN KEY (user_id) REFERENCES sys_user(id))")) {
            }
            try (PreparedStatement st = connection.prepareStatement("insert into article(name, content, date, user_id) values('ar1', 'content1', '21.12.2017', 1))")) {
            }
        }

    }
}