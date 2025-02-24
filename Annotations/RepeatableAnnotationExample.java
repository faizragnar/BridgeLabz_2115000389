import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Software {
    @BugReport(description = "Null pointer exception on login")
    @BugReport(description = "UI alignment issue on dashboard")
    public void run() {
        System.out.println("Software running");
    }
}

public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method = Software.class.getMethod("run");
        if (method.isAnnotationPresent(BugReports.class)) {
            for (BugReport bug : method.getAnnotationsByType(BugReport.class)) {
                System.out.println("Bug: " + bug.description());
            }
        }
    }
}
