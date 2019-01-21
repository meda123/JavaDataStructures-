package com.stack.example;

public class RunArrayStack {
	public static void main(String[] args) {
		
		ArrayStack nums = new ArrayStack(); 
		nums.push(15);
		nums.push(8);
		nums.push(23);
		nums.push(36);
		
		
		System.out.print("Original stack: ");
		nums.show();
		
		System.out.printf("%n");
		System.out.println("Peek operation " + nums.peek());
		
		System.out.printf("%n");
		System.out.println("Pop operation " + nums.pop());
		
		System.out.print("Stack after pop operation: ");
		nums.show();
			
		}

}
