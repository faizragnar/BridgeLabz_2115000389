import java.util.*;
public class QueueWithStack{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	InnerQueueWithStack queue = new InnerQueueWithStack();
	System.out.println("enter the size of queue - ");
	int size = sc.nextInt();
	System.out.println("enter the values enqueue");
	for(int i=0; i<size;i++){
		int value = sc.nextInt();
		queue.enqueue(value);
	}
	System.out.println("Dequed values");
	for(int i=0; i<size;i++){
		System.out.print
		( queue.dequeue() + " ");

	}

	
	
	}
	

}
class InnerQueueWithStack {
private Stack <Integer> stack1 = new Stack<>();
private Stack <Integer> stack2 = new Stack<>();

public void enqueue(int value){
stack1.push(value);
}
public int dequeue(){
	if(stack2.isEmpty()){
		if(stack1.isEmpty()){throw new RuntimeException("Stack is empty");}
		
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
	}
	return stack2.pop();
}
	
}