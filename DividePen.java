/*Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint => 
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___*/
public class DividePen{
	public static void main(String[] args){
		
		int total_pen = 14;
		int student_count = 3;
		
		int divided_pen = total_pen / student_count;
		 int pen_left = total_pen % student_count;
		
		System.out.print("The Pen Per Student is " + divided_pen + " and the remaining pen not distributed is "+ pen_left );

	}
}