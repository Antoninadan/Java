package ua.i.mail100;

import ua.i.mail100.Entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testUnit");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

//        // to create in DB
//        Student st = new Student("dfgdf");
//        em.persist(st);
//        st.setName("Vasya");
//
//        // delete all
//        em.remove(st);

//        // create from finding
//        Student st = em.find(Student.class, 1L);
//        System.out.println(st);

        // execute query
        System.out.println("My result: " + em.createQuery("from Student").getResultList());

        em.getTransaction().commit(); // approve
        em.close();
        factory.close();
    }
}
