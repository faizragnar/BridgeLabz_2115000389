import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Course> courses;

    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }
}

class Course {
    private String title;

    public Course(String title) {
        this.title = title;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("GLA University");
        Student student = new Student("jhonny");
        Professor professor = new Professor("Dr. mridul");
        Course course = new Course("Physics");
        university.addCourse(course);
    }
}
