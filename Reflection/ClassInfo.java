import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = args[0];
        Class<?> cls = Class.forName(className);

        System.out.println("Methods:");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("\nFields:");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}
