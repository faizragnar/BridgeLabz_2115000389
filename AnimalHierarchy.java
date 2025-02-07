public class AnimalHierarchy{
	public static void main(String[] args){
		Animal dog = new Dog("destroyer",2) ;
		Animal cat = new Cat("Anubis",3) ;
		Animal bird = new Bird("Attack helicopter",1) ;
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();

	}
}
	
class Animal{
	protected String name;
	protected int age;
	
	public Animal(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void makeSound(){
			System.out.print("some animal sounds");
	}
	public void display(){
		System.out.print("Name- " + name +"\nage- "+age+"\n");
		
	}
}
	
class Dog extends Animal{
	
	public Dog(String name,int age){
	super(name,age);
	}
	
	public void makeSound(){
		super.display();
		System.out.print("sound- barks\n");
		
	}
	
}
	
class Cat extends Animal{
	public Cat(String name,int age){
	super(name,age);
	}
	public void makeSound(){
		super.display();
		System.out.print("meows\n");
		
	}
}
	
class Bird extends Animal{
	public Bird(String name,int age){
	super(name,age);
	}
	public void makeSound(){
		super.display();
		System.out.print("chirps\n");
		
	}
}
	
