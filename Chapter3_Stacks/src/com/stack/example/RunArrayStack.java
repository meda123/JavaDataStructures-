package com.stack.example;

public class RunArrayStack {
	public static void main(String[] args) {
		
		ArrayStack nums = new ArrayStack(); 
		nums.push(15);
		nums.push(12);
		nums.push(13);
		
		
		System.out.print("Original stack: ");
		nums.show();
		
		System.out.printf("%n");
		System.out.println("Peek operation " + nums.peek());
		
		System.out.printf("%n");
		System.out.println("Pop operation " + nums.pop());
		
		System.out.print("Stack after pop operation: ");
		nums.show();
		
		System.out.printf("%n");
		System.out.println("Stack size is " + nums.size());
		
		System.out.printf("%n");
		System.out.println("Is stack empty " + nums.isEmpty());
		
		}

}
