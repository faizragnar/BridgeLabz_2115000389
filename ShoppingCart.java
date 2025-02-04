class product{
		static double discount= 10;
		private final int productid ;
		private String name;
		private double price;
		private int quantity;
		
		public product(String name, int productid,double price,int quantity){
			this.name=name;
			this.productid=productid;
			this.price=price;
			this.quantity=quantity;
		}
		public static void updatediscount(){
			System.out.println(discount + "% discount");
		}
		public void display(){
			if(this instanceof product){
				System.out.println("name of the product - " + name);
				System.out.println("product id - " + productid);
				System.out.println("price - INR " +price);
				System.out.println("Quantity - " +quantity + "\n");
			}
			
		}
	
}

public class ShoppingCart{
	public static void main(String[] args){
		product p1 = new product("hand soap",2232,40,200);
		product p2 = new product("shampoo",3332,200,75);
		
		product.updatediscount();
		p1.display();
		p2.display();

	}
}