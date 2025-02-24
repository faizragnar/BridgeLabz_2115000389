import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        this.username = username;
        validate();
    }

    private void validate() throws Exception {
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);
                String value = (String) field.get(this);
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (value.length() > maxLength) {
                    throw new IllegalArgumentException("Field " + field.getName() + " exceeds max length of " + maxLength);
                }
            }
        }
    }
}

public class MaxLengthValidation {
    public static void main(String[] args) {
        try {
            User validUser = new User("JohnDoe");
            System.out.println("Valid user created");

            User invalidUser = new User("VeryLongUsername");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
