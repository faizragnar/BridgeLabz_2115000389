public class EmployeeManagement{
	public static void main(String[] args){
		Employee e1 = new Manager(101,"Dutch",70000,20);
		Employee e2 = new Developer(201,"Aurthor morgan",100000,"java");
		Employee e3 = new Intern(301,"Jhon marston",40000,6);
		System.out.println("\tManger Details \n");
		e1.displayDetails();
		
		System.out.println("\tDeveloper Details \n");
		e2.displayDetails();
		
		System.out.println("\tInter Details \n");
		e3.displayDetails();
	}
}

class Employee{
	protected int id;
	protected String name;
	protected double salary;
	
	public Employee(int id, String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void displayDetails(){
		System.out.println("ID - " + id);
		System.out.println("Name - " + name);
		System.out.println("Salary - INR " + salary);
	}
}

class Manager extends Employee{
	private int teamSize;
	public Manager(int id,String name, double salary, int teamSize){
		super(id,name,salary);
		this.teamSize=teamSize;
	}
	
	public void displayDetails(){
		
		super.displayDetails();
		System.out.println("Team Size - "+teamSize+"\n");
	}
}

class Developer extends Employee{
	private String language;
	public Developer(int id,String name, double salary,String language){
		super(id,name,salary);
		this.language=language;
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Language - "+language+"\n");
	}
}

class Intern extends Employee{
	private int Duration;
	public Intern(int id,String name, double salary,int Duration){
		super(id,name,salary);
		this.Duration=Duration;
	}

	public void displayDetails(){
		super.displayDetails();
		System.out.println("Internship duration - "+Duration+" months");
	}
}

