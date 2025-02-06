import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }
}

class Course {
    private String title;

    public Course(String title) {
        this.title = title;
    }
}

public class SchoolandStudents {
    public static void main(String[] args) {
        School school = new School("High School");
        Student student = new Student("Emma");
        Course math = new Course("Mathematics");
        student.enrollCourse(math);
        school.enrollStudent(student);
    }
}
