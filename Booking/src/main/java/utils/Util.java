package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
    public static final String CONNECTION_DRIVER = "org.postgresql.Driver";
    public static final String CONNECTION_URL = "jdbc:postgresql://localhost/postgres";
    public static final String CONNECTION_USER = "postgres";
    public static final String CONNECTION_PASSWORD = "estafeta";
    public static final String CONNECTION_SQL_GET_ALL = "select * from user_sys";

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("testUnit");

    public EntityManagerFactory getFactory() {
        return factory;
    }

}
