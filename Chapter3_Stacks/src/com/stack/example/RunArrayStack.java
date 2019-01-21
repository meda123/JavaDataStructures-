package com.stack.example;

public class RunArrayStack {
	public static void main(String[] args) {
		
		ArrayStack nums = new ArrayStack(); 
		nums.push(15);

		nums.push(8);
		
		nums.push(23);
		
		System.out.println("Test");
		System.out.println(nums.peek());
		System.out.println("Test");

		nums.push(10);
		
		nums.show();
		
		System.out.printf("%n");
		System.out.println("----");
		
		nums.pop();
		
		nums.show();
		
		}

}
