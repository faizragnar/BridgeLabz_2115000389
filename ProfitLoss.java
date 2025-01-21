/*Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___*/



public class ProfitLoss{
	public static void main(String[] args){
		
		int cost_price = 129;
		int sell_price = 191;
		
		int profit = sell_price - cost_price;
		double profit_percentage = (profit*100)/cost_price;
		
		System.out.print(" The Cost Price is INR 129 and Selling Price is INR 191 \n The Profit is INR " + profit +" and the Profit Percentage is " + profit_percentage);

	}
}
