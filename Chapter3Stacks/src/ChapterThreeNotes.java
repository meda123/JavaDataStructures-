public class ChapterThreeNotes{

	
	// Notes on PostfixEvaluator 
	
	/*
	 - Infix format: 5 + 5 
	 - Postfix format: 5 5 + 
	 - The PostFixEvaluator class uses the java.util.Stack class to create the stack attribute. 
	 - The java.util.Stack class is one of two stack implementations provided by Java Collections API
	 */
	
	
	/*
	 SECTION 3.6 A STACK ADT 
	 
	  Interface: Defines a set of abstract methods and is useful in separating the concept of an abstract data type
	  from its implementation. 
	  	  
	  Stacks are used often in the real world -> Undo function in a word processor 
	  
	  Drop-out Stack: Same as regular stack but it has a limit on the # of elements it will hold, and once that 
	  limit is reached the element on the bottom of the stack drops off 
	  
	  Keep in mind  the separation between the collection and underlying data structure used to implement it. We 
	  can use an array to create the Stack data structure. 
	 */
	
	
	/*
	 SECTION 3.7: IMPLEMENTING A STACK: WITH ARRAYS 
	 When an array object is created, it is allocated a specific number of cells into which elements can be stored
	 Object [ ] collection = Object[500]; 
	 
	 Crucial question in the design of a collection is what to do in case in which a new element is added to a full
	 data structure. Three basic options exist: 
	 
	 1. We could implement operations that add an element to the collection such that they throw and exception if the DS is full 
	 2. We could implement the add operations to return a status indicator that can be checked by the user to see if the add
	 operation was successful 
	 3. We could automatically expand the capacity of the underlying DS whenever necessary so that essentially, it would never be full 
	 
	 Since our goal is to separate implementation from interface, option #3 is the way to go 	
	 */
	
	
	
	/*
	 SECTION 3.8 The ArrayStack Class 
	 
	 An array implementation of a stack can be designed by making the following 4 assumptions: 
	 
	 1. The arrays is an array of object references 
	 2. The bottom of the stack is always index 0 of the array 
	 3. The elements of the stack are stored in order and contiguously in the array 
	 4. There is an integer variable top that stores the index of the array immediately following the top element in the stack 
	 
	 
	 // WEDNESDAY: WRite out ArrayStack in it's own class :) 
	  
	  
	 
	 
	 */

	
	
	// REVIEW QUESTIONS 
	
	
	
	
	
	
	
	// REVIEW EXERCISES 
	
	


	

	
}
