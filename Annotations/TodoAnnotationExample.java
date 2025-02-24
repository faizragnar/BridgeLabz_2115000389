import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {}

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {}

    @Todo(task = "Improve UI responsiveness", assignedTo = "Charlie", priority = "LOW")
    public void improveUI() {}
}

public class TodoAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method[] methods = Project.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName() +
                        ", Task: " + todo.task() +
                        ", Assigned To: " + todo.assignedTo() +
                        ", Priority: " + todo.priority());
            }
        }
    }
}
