package com.stack.example;

public class ArrayStack {
	
	// size of the stack 
	int stack[ ] = new int[5];
	// captures the first element of the stack
	int top = 0;
	
	
	// Inserts given integer to the stack 
	public void push (int data )
	{
		if (top==5)
		{
			System.out.println("Stack is full");
		}
		else 
		{
			stack[top] = data; 
			top++;	
		}
		
	}
	
	
	// Removed the top item from the stack
	public int pop()
	{
		int data =0;
		
		if (isEmpty()) 
		{
			System.out.println("Stack is empty");
		}
		
		else
		{
			top --;
			data = stack[top];
			stack[top]=0;
		}
		return data;
	}
	
	
	// Returns the value of the top of the stack w/o removing top element
	public int peek() 
	{
		int data; 
		data = stack[top-1];
		return data;
	}
	
	// Returns size of the stack 
	public int size() 
	{
		return top;
	}
	
	
	// Checks if the stack is empty  
	public boolean isEmpty() 
	{
		return top <=0;
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
