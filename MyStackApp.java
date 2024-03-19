package stack_package;

public class MyStackApp {

	public static void main(String[] args) {
		
		StackX myStack1 = new StackX(5);
		
		myStack1.push(20);
		myStack1.push(40);
		myStack1.push(60);
		myStack1.push(80);

		
		while(!myStack1.isEmpty()) {
			long v;
			v = myStack1.pop();
			System.out.println(v);
			System.out.println(" ");
		}
	
	}
	
}
