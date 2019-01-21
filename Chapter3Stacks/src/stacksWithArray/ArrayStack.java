package stacksWithArray;

public class ArrayStack 
{
	int stack[ ] = new int[5];
	int top = 0;
	
	
	// Inserts given integer to the stack 
	public void push (int data )
	{
		stack[top] = data; 
		top++;
	}
	
	
	// Removed the top item from the stack
	public int pop()
	{
		int data;
		top --;
		data = stack[top];
		stack[top]=0;
		return data;
	}
	
	
	// Returns the value of the top of the stack w/o removing top element
	public int peek() 
	{
		int data; 
		data = stack[top-1];
		return data;
	}
	
	// Prints the stack
	public void show() 
	{
		for (int n: stack) 
		{
			System.out.print(n + " ") ;
		}
	}
	
}
	
	
	










