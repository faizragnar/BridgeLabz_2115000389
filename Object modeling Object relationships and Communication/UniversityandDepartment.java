import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }
}

public class UniversityandDepartment {
    public static void main(String[] args) {
        University uni = new University("GLA University");
        Department cs = new Department("Computer Science");
        Faculty prof = new Faculty("mohit");
        uni.addDepartment(cs);
        uni.addFaculty(prof);
    }
}
