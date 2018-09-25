import java.lang.annotation.*;

@Inherited // наследование
@Target(value={ElementType.METHOD}) // for what used: TYPE, METHOD, FIELD
@Retention(value= RetentionPolicy.RUNTIME) // when it runs

public @interface MyAnnotation {
    String param1() default "string"; // значение параметра
    String param2();
}
