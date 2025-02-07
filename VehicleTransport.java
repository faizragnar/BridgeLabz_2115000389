public class VehicleTransport{
	public static void main(String[] args){
		
		Vehicle v1 = new Car(200,"Petrol",7);
		Vehicle v2 = new Truck(100,"Disel",1000);
		Vehicle v3 = new Motorcycle(250,"Petrol",50);
		System.out.println("\tCar Details \n");
		v1.DisplayInfo();
		
		System.out.println("\tTruck Details \n");
		v2.DisplayInfo();
		
		System.out.println("\tMotercycle Details \n");
		v3.DisplayInfo();
	
	}
}
class Vehicle{
	protected int MaxSpeed;
	protected String fueltype;
	
	public Vehicle(int MaxSpeed, String fueltype){
		this.MaxSpeed=MaxSpeed;
		this.fueltype=fueltype;
		
	}
	public void DisplayInfo(){
		System.out.println("Max speed- " + MaxSpeed);
		System.out.println("Type of fuel - " + fueltype);
	
	}
}

class Car extends Vehicle{
	private int seats;
	public Car(int MaxSpeed,String fueltype, int seats){
		super(MaxSpeed,fueltype);
		this.seats=seats;
	}
	
	public void DisplayInfo(){
		
		super.DisplayInfo();
		System.out.println("Seat capacity - "+seats+"\n");
	}
}

class Truck extends Vehicle{
	private int Capacity;
	public Truck(int MaxSpeed,String fueltype,int Capacity){
		super(MaxSpeed,fueltype);
		this.Capacity=Capacity;
	}
	public void DisplayInfo(){
		super.DisplayInfo();
		System.out.println(" Load Capacity - "+ Capacity+" KG\n");
	}
}

class Motorcycle  extends Vehicle{
	private int milage;
	public Motorcycle (int MaxSpeed,String fueltype,int milage){
		super(MaxSpeed,fueltype);
		this.milage=milage;
	}

	public void DisplayInfo(){
		super.DisplayInfo();
		System.out.println("Milage - "+milage+" KM/L");
	}
}

