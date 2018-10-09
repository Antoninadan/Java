package ua.i.mail100;

import ua.i.mail100.Entity.ClassRoom;
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

        // to create in DB
        ClassRoom cr = new ClassRoom(12L);

        Student st1 = new Student("Petya");
        Student st2 = new Student("Vasya");

        st1.setClassRoom(cr);
        st2.setClassRoom(cr);

        em.persist(cr);
        em.persist(st1);
        em.persist(st2);

        // find
        System.out.println("Find student with id = 1: " + em.find(Student.class, 2L));
        System.out.println("Find student with id = 1 and get class room: " + em.find(Student.class, 2L).getClassRoom());
        System.out.println("Find class_room with id = 1: " + em.find(ClassRoom.class, 1L));
        System.out.println("Find class_room with id = 1 and get many students: " + em.find(ClassRoom.class, 1L).getStudents());


//
//        // delete all
//        em.remove(st);

//        // create from finding
//        Student st = em.find(Student.class, 1L);
//        System.out.println(st);

//        // execute query
//        System.out.println("My result: " + em.createQuery("from Student").getResultList());

        em.getTransaction().commit(); // approve


        em.close();
        factory.close();
    }
}
