class Vehicle{
		static int registrationFee= 2000;
		private final String registrationNumber ;
		private String ownerName;
		private String vehicleType;
		
		public Vehicle(String registrationNumber , String ownerName,String vehicleType){
			this.registrationNumber =registrationNumber ;
			this.ownerName=ownerName;
			this.vehicleType=vehicleType;
		}
		public static void  updateRegistrationFee(){
			System.out.println("Registrstion fee - INR "+registrationFee+"\n");
		}
		public void display(){
			if(this instanceof Vehicle){
				System.out.println("Registration number - " + registrationNumber );
				System.out.println("Name - " + ownerName);
				System.out.println("vehicleType - " +vehicleType +"\n");
			}
			
		}
	
}

public class VehicleRegistration{
	public static void main(String[] args){
		Vehicle v1 = new Vehicle("UP85 KSHI 762","rohit","MARUTI SUZUKI");
		Vehicle v2 = new Vehicle("DL02 JBUK 453","Mohit","HONDA CITY");
		
		Vehicle. updateRegistrationFee();
		v1.display();
		v2.display();

	}
}