import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
}

public class  CompanyandDepartment {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        Department it = new Department("IT");
        Employee e1 = new Employee("John");
        it.addEmployee(e1);
        company.addDepartment(it);
    }
}
