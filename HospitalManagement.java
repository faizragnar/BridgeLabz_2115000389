class Patient{
		static String hospitalName = "AIIMS";
		private final int patientID ;
		private String Name;
		private int age;
		private String ailment ;
		static int NumberOfPatient=0;
		
		public Patient(int patientID , String Name,int age,String ailment){
			this.patientID =patientID ;
			this.Name=Name;
			this.age=age;
			this.ailment = ailment;
			NumberOfPatient++;
		}
		public static void  getTotalPatients(){
			System.out.println("Hospital name - "+hospitalName);
			System.out.println("Number Of Patient - "+ NumberOfPatient +"\n");
			
		}
		public void display(){
			if(this instanceof Patient){
				System.out.println("Patient ID - " + patientID );
				System.out.println("Name - " + Name);
				System.out.println("age - " +age );
				System.out.println("Ailment - " +ailment +"\n");

			}
			
		}
	
}

public class HospitalManagement{
	public static void main(String[] args){
		Patient p1 = new Patient(762,"rohit",74,"Asthama");
		Patient p2 = new Patient(453,"Mohit",33,"Maleria");
		
		Patient. getTotalPatients();
		p1.display();
		p2.display();

	}
}