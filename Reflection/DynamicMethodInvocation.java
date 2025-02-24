import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String methodName = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        MathOperations obj = new MathOperations();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        System.out.println(method.invoke(obj, a, b));
    }
}
