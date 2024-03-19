



package stack_package;

public class StackX {

	private int maxSize;					//size of Stack array
	private long [] stackArray; 
	private int top;						//top of Stack
	
	public StackX (int s) { 				//constructor
		maxSize = s;						//set stack array size
		stackArray = new long[maxSize];		//create array
		top = -1;							//no items yet
	}
	
//	public void push (long j) {      // put item on top of the Stack
//		if (top == maxSize - 1) {     
//		   System.out.println("Stack is full"); //check stack is already full?
//		}
//		else {   
//			top++;
//		   stackArray[top] = j;     //increment top and insert item
//		}
//	}
	
	public void push (long j) {						// put item on top of the Stack
		if (top == maxSize - 1) {					
			System.out.println("Stack is full");	//check stack is already full?
		}
		else {			
			stackArray[++top] = j;					//increment top and insert item
		}
	}
	
//	public long pop() {								//take item from top of the stack
//	
//		long k = stackArray[top];					//declare a variable to set topmost item of the stack
//		
//		if(top == -1) {								//check stack is empty?
//			System.out.println("stack is empty");	
//		}
//		else {
//			top--;									//decrement top
//		}
//		return k;									//return the top value
//	}
	
	public long pop() {								//take item from top of the stack
		
		if(top == -1) {
			System.out.println("stack is empty");	//check stack is empty?
		}
		return stackArray[top--];					//access item, decrement top
	}
	
	public long peek() {							//peek at top of the stack
		if(top == -1) {								//check stack is already empty
			return -99;								
		}
		else {
			return stackArray[top];					//peek the top value
		}
	}
	
	public boolean isFull() {						
		return (top == maxSize - 1);				//true if stack is full
	}
	
	public boolean isEmpty() {
		return (top == -1);							//true if stack is empty
	}
	
	public int size() {
	    return top + 1; 							// Since top represents the index of the last element
	}
	
	
}
