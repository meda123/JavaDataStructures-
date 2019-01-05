import java.util.Stack;
import java.util.Scanner;

// Purpose: Represents an integer evaluator of postfix expressions. Assumes the operands are constant. 

public class PostfixEvaluator 
{

	private final static char ADD = '+';
	private final static char SUBTRACT = '-';
	private final static char MULTIPLY = '*';
	private final static char DIVIDE = '/';
	private Stack<Integer> stack;
	
	
	// Set up evaluator by creating a new stack 
	public PostfixEvaluator() 
	{
		stack = new Stack<Integer>();
	}
	
	/**
	Evaluate method: Evaluates postfix expression. If an operand is encountered (e.g. 5), it is pushed into the stack.
	If an operator is encountered (e.g. +), two operands are popped, the expression is evaluated, and the result is 
	pushed onto the stack. 
	 **/
	
	public int evaluate(String expr) 
	{
		int op1, op2, result=0;
		String token;
		Scanner parser= new Scanner(expr);
		
		while (parser.hasNext())
		{
			token = parser.next();
			
			if (isOperator(token))	
			{
				op2 = (stack.pop()).intValue();
				op1 = (stack.pop()).intValue();
				result = evaluateSingleOperator(token.charAt(0), op1, op2);
				stack.push(new Integer(result));	
			}	
			else 
				stack.push(new Integer (Integer.parseInt(token)));
				
		}
		parser.close();
		return result; 
	}
	
	// Determine if specified token is an operator 
	private boolean isOperator(String token)
	{
		return ( token.equals("+") || token.equals ("-") ||
				token.equals("*") || token.equals ("/") );
	}
	
	
	// Performs integer evaluation on a single expression consisting of the specified operator and operands 
	private int evaluateSingleOperator(char operation, int op1, int op2) 
	{
		int result = 0;
		switch (operation)
		{
			case ADD:
				result = op1 + op2;
				break;
			case SUBTRACT:
				result = op1 - op2;
				break;
			case MULTIPLY:
				result = op1 * op2;
				break;
			case DIVIDE:
				result = op1 / op2;
		}
		return result; 
		}
	
	}
	
	
	
	
	

