 class Employee{
	private String name;
	private int id;
	private int salary;
	
	public Employee(String name, int id , int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void display() {
		System.out.println("employee name - "+ name );
		System.out.println("id - " + id);
		System.out.println("salary - INR " + salary);		
	}
}

public class EmployeeDetail{
	public static void main(String args[]){
		Employee e1 = new Employee("Rohit",1001,20000);
		Employee e2 = new Employee("Mohit",1002,25000);
		
		e1.display();
		e2.display();
	}


}