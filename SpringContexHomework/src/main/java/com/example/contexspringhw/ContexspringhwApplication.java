package com.example.contexspringhw;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class ContexspringhwApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        Action actionOne = (Action) ctx.getBean("Mercedes Actros");
        actionOne.move();

        Action actionTwo = (Action) ctx.getBean("Honda Civic");
        actionTwo.move();

        Action actionThree = (Action) ctx.getBean("Black Pearly");
        actionThree.move();

        Action actionFour = (Action) ctx.getBean("Robert");
        actionFour.move();

        System.out.println(ctx.getBeansOfType(Car.class));
        System.out.println(ctx.getBeansOfType(Driver.class));
        System.out.println(ctx.getBean(Lorry.class).getDriver().getName());
        System.out.println(ctx.getBean(Ship.class));

    }

//    @Service
//    class TestClass1 {
//        private TestClass2 testClass2;
//
//        @Autowired
//        public TestClass2 testClass2() {
//            return new TestClass2();
//        }
//    }
//
//    @Service
//    class TestClass2 {}

//    public List<Class<?>> loadClassesInPackage() throws IOException {
//        List<Class<?>> classes = Lists.newArrayList();
//        String packageName = getClass().getPackage().getName();
//
//        ClassPath.ClassInfo
//
//        for (ClassPath.ClassInfo classInfo : ClassPath.from(getClass().getClassLoader()).getTopLevelClasses(packageName)) {
//            Class<?> cls;
//            try {
//                cls = classInfo.load();
//            } catch (NoClassDefFoundError e) {
////                // In case there were linking problems, this is probably not a class we care to test anyway.
////                logger.log(Level.SEVERE, "Cannot load class " + classInfo + ", skipping...", e);
////                continue;
//            }
//            if (!cls.isInterface()) {
//                classes.add(cls);
//            }
//        }
//        return classes;
//    }


//    public static void getClassOfPackage() {
//
//        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        try {
//
//            ClassPath classpath = ClassPath.getAllClasses();
//            ClassPath classpath = ClassPath.from(loader); // scans the class path used by classloader
//            for (ClassPath.ClassInfo classInfo : classpath.getTopLevelClasses("org.mypackage")) {
//                System.out.println(classInfo.getSimpleName()+" <==> "+classInfo.getPackageName());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

}
