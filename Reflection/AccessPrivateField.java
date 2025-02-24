import java.lang.reflect.Field;

class Person {
    private int age;
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        field.set(person, 25);
        System.out.println(field.get(person));
    }
}
