package com.example.springtest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@SpringBootApplication
//@SpringBootApplication помогает автоматической конфигурации Spring, и автоматически сканировать  (scan) весь проект, чтобы найти компоненты Spring (Controller, Bean, service, ...)
public class SpringtestApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext contex = SpringApplication.run(SpringtestApplication.class, args);

        TestClass1 testClass1Bean = (TestClass1) contex.getBean(TestClass1.class);
        TestClass2 testClass2Bean = (TestClass2) contex.getBean(TestClass2.class);
        X xBean = (TestClass2) contex.getBean(X.class);

        System.out.println("######### Get bean TestClass1 = " + testClass1Bean);
        System.out.println("######### Get bean TestClass2 = " + testClass2Bean);
        System.out.println("######### Test (testClass1Bean == testClass1Bean) = " + (testClass1Bean == testClass1Bean));
        System.out.println("######### Test method testClass2Bean.getA() = " + testClass2Bean.getA());
        System.out.println("######### Get bean X = " + xBean);
    }


    // test class 1
    class TestClass1 extends X {
    }

    @Bean
    public TestClass1 testClass1() {
        return new TestClass1();
    }


    // test class 2
    @Service
    @Primary // fix error
    class TestClass2 extends X {
        private TestClass1 testClass1;
        private int a = 1;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        @Autowired
        public TestClass1 testClass1() {
            return new TestClass1();
        }

    }


    // test class X
    class X {
    }


}
