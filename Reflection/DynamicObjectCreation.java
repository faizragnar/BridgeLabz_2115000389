import java.lang.reflect.Constructor;

class Student {
    public Student() {}
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Constructor<Student> constructor = Student.class.getDeclaredConstructor();
        Student student = constructor.newInstance();
        System.out.println(student);
    }
}
