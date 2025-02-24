import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class DIContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    public <T> void register(Class<T> clazz) throws Exception {
        instances.put(clazz, clazz.getDeclaredConstructor().newInstance());
    }

    public <T> T getInstance(Class<T> clazz) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(obj, instances.get(field.getType()));
            }
        }
        return obj;
    }
}

class Service {
    public void execute() {
        System.out.println("Service Executed");
    }
}

class Client {
    @Inject
    private Service service;

    public void run() {
        service.execute();
    }
}

public class DIExample {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();
        container.register(Service.class);
        Client client = container.getInstance(Client.class);
        client.run();
    }
}
