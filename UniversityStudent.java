class Student{
		static String UniversityName= "GLA university";
		private final int roll ;
		private String name;
		private String grade;
		private static int NumberOfStudent=0;
		public Student(int roll, String name,String grade){
			this.roll=roll;
			this.name=name;
			this.grade=grade;
			NumberOfStudent++;
		}
		public static void  displayTotalStudents(){
			System.out.println("name of university - "+UniversityName);
			System.out.println("Number Of Student - "+NumberOfStudent+"\n");
			
		}
		public void display(){
			if(this instanceof Student){
				System.out.println("roll Number - " + roll);
				System.out.println("Name - " + name);
				System.out.println("grade - " +grade +"\n");
			}
			
		}
	
}

public class UniversityStudent{
	public static void main(String[] args){
		Student s1 = new Student(1,"rohit","A+");
		Student s2 = new Student(2,"Mohit","B+");
		
		Student. displayTotalStudents();
		s1.display();
		s2.display();

	}
}