import java.util.Scanner;

// Purpose: Show use of Stacks to evaluate postfix expressions (1 1 +) 


public class PostfixTester {
	
	public static void main(String[] args) {
		
		String expression, again;
		int result;
		
		Scanner in = new Scanner(System.in);
		
		
		do 
		{
			
			PostfixEvaluator evaluator = new PostfixEvaluator();
			System.out.println("Enter a valid post-fix expression one token" + " at a time with a space "
					+ "between each  token" + " (e.g. 5 4 +)");
			
			System.out.println("Each token must be an integer");
			
			expression = in.nextLine();
			result = evaluator.evaluate(expression);
			System.out.println();
			System.out.println("That expression equals " + result);
			System.out.print("Evaluate another expression [Y/N] ?");
			again = in.nextLine();
			System.out.println();
			
		}
		while (again.equalsIgnoreCase("y"));
		in.close();
		
		
	}

}
