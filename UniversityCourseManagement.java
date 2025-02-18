import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String courseName;
    private String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }
}

class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public List<T> getCourses() {
        return courseList;
    }
}

class UniversityUtil {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName() + ", Instructor: " + course.getInstructor());
        }
    }
}

public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics", "A"));
        examCourses.addCourse(new ExamCourse("Physics", "B"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("History", "C"));
        assignmentCourses.addCourse(new AssignmentCourse("Literature", "D"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research", "E"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing", "F"));

        System.out.println("Exam Courses:");
        UniversityUtil.displayCourses(examCourses.getCourses());
        
        System.out.println("\nAssignment Courses:");
        UniversityUtil.displayCourses(assignmentCourses.getCourses());
        
        System.out.println("\nResearch Courses:");
        UniversityUtil.displayCourses(researchCourses.getCourses());
    }
}
