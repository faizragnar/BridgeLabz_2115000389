class Employee{
		static String CompanyName= "Capgemini";
		private final int id ;
		private String name;
		private String Desgnation;
		
		public Employee(int id, String name,String Desgnation){
			this.name=name;
			this.id=id;
			this.Desgnation=Desgnation;
		}
		public static void  displayTotalEmployees(){
			System.out.println(CompanyName+"\n");
		}
		public void display(){
			if(this instanceof Employee){
				System.out.println("ID Number - " + id);
				System.out.println("Name - " + name);
				System.out.println("Designation - " +Desgnation +"\n");
			}
			
		}
	
}

public class EmployeeManagement{
	public static void main(String[] args){
		Employee e1 = new Employee(56714572,"rohit","Manager");
		Employee e2 = new Employee(4587236,"Mohit","Tester");
		
		Employee. displayTotalEmployees();
		e1.display();
		e2.display();

	}
}