import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Operations {
    @ImportantMethod
    public void criticalTask() {
        System.out.println("Executing critical task");
    }

    @ImportantMethod(level = "MEDIUM")
    public void secondaryTask() {
        System.out.println("Executing secondary task");
    }

    public void normalTask() {
        System.out.println("Executing normal task");
    }
}

public class ImportantMethodExample {
    public static void main(String[] args) throws Exception {
        Method[] methods = Operations.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}
