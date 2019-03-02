import java.lang.annotation.*;

@Inherited // наследование
@Target(value={ElementType.METHOD}) // for what used: TYPE, METHOD, FIELD
@Retention(value= RetentionPolicy.RUNTIME) // when it runs

public @interface MyAnnotation {
    int a();
    int b();
}
