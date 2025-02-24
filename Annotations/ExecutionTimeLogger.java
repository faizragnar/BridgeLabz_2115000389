import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class PerformanceTest {
    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++);
    }

    @LogExecutionTime
    public void slowMethod() throws InterruptedException {
        Thread.sleep(500);
    }
}

public class ExecutionTimeLogger {
    public static void main(String[] args) throws Exception {
        PerformanceTest obj = new PerformanceTest();
        Method[] methods = PerformanceTest.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();
                System.out.println("Method: " + method.getName() +
                        ", Execution Time: " + (end - start) / 1_000_000.0 + " ms");
            }
        }
    }
}
