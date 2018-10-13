package ua.i.mail100;

import org.hibernate.transform.Transformers;
import ua.i.mail100.Entity.ClassRoom;
import ua.i.mail100.Entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Iterator;
import java.util.List;

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
//        ClassRoom cr = new ClassRoom(12L);
//
//        Student st1 = new Student("Petya");
//        Student st2 = new Student("Vasya");
//
//        st1.setClassRoom(cr);
//        st2.setClassRoom(cr);
//
//        em.persist(cr);
//        em.persist(st1);
//        em.persist(st2);

        // find
//        System.out.println("Find student with id = 1: " + em.find(Student.class, 2L));
//        System.out.println("Find student with id = 1 and get class room: " + em.find(Student.class, 2L).getClassRoom());
//        System.out.println("Find class_room with id = 1: " + em.find(ClassRoom.class, 1L));
//        System.out.println("Find class_room with id = 1 and get many students: " + em.find(ClassRoom.class, 1L).getStudents());


//
//        // delete all
//        em.remove(st);

//        // create from finding
//        Student st = em.find(Student.class, 1L);
//        System.out.println(st);

//        // execute query
//        System.out.println("My result: " + em.createQuery("from Student").getResultList());


        // how to create object from DB

        TypedQuery<ClassRoom> lQuery = em.createQuery("from class_room", ClassRoom.class);
        List<ClassRoom> classRooms = lQuery.getResultList();


//        TypedQuery<Student> lQuery2 = em.createQuery("from Student", Student.class);
//        List<Student> students = lQuery2.getResultList();
//
//
//        Iterator<Student> itr1 = students.iterator();
//        for (; itr1.hasNext(); ) {
//            Student element = itr1.next();
//            System.out.println(element.toString());
//        }

        // https://stackoverflow.com/questions/7952064/mapping-list-from-jpa-query-getresultlist-to-a-customized-to
//        List students = em.createQuery(
//                "from Student")
//                .setParameter("shape", paramShape)
//                .setResultTransformer( Transformers.aliasToBean(FruitSearchTO.class))
//                .list();

        em.getTransaction().commit(); // approve

        em.close();
        factory.close();
    }
}
