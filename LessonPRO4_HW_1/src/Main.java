import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class Test {

    @MyAnnotation(a = 2, b = 5)
    public void test1(int a, int b) {
        System.out.println("test1: a = " + a + ", b = " + b);
    }

    @MyAnnotation(a = 3, b = 4)
    public void test2(int a, int b) {
        System.out.println("test2: a = " + a + ", b = " + b);
    }

    public void test3(int a, int b) {
        System.out.println("test3: a = " + a + ", b = " + b);
    }
}


public class Main {
    public static void main(String[] args) {

        Test obj = new Test();
        Class<?> cls = Test.class;
        Method[] methods = cls.getMethods();

        try {
            for (Method method : methods) {
                if (method.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation an = method.getAnnotation(MyAnnotation.class);
                    method.invoke(obj, an.a(), an.b());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


