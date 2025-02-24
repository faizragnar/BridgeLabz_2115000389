import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}

class JsonSerializer {
    public static String toJson(Object obj) throws Exception {
        Map<String, String> jsonMap = new HashMap<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                String key = field.getAnnotation(JsonField.class).name();
                String value = (String) field.get(obj);
                jsonMap.put(key, value);
            }
        }
        return jsonMap.toString().replace("=", ":");
    }
}

public class CustomJsonSerialization {
    public static void main(String[] args) throws Exception {
        User user = new User("JohnDoe", "john@example.com");
        System.out.println(JsonSerializer.toJson(user));
    }
}
