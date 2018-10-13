package dao;

import interfaces.UserInterface;
import models.User;
import utils.Util;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UserDAOHibernate implements UserInterface {

    Util util = new Util();

    @Override
    public List<User> getAll() {

        EntityManager entityManager = util.getFactory().createEntityManager();
        entityManager.getTransaction().begin();

        // test
        User user4 = new User("user4", "4", 1);
        List<User> userMas = new ArrayList<>();
        userMas.add(user4);
//        entityManager.persist(user4);


//        TypedQuery<User> lQuery = entityManager.createQuery("from user_sys", User.class);
//        List<User> userMas = lQuery.getResultList();

        System.out.println("My result: " + entityManager.createQuery("from user_sys").getResultList());


        entityManager.getTransaction().commit(); // approve

        return userMas;

    }
}
