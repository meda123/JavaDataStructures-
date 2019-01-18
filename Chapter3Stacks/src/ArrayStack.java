import java.util.Arrays;


public class ArrayStack <T> implements StackADT <T> {
	
	private final static int DEFAULT_CAPACITY = 100;
	
	private int top;
	private T[] stack;
	


public ArrayStack() {
	this (DEFAULT_CAPACITY);
}

public ArrayStack (int initialCapacity) {
	top = 0;
	stack = (T[]) (new Object [initialCapacity]);
}


public void push (T element) {
	
	if (size() == stack.length)
		expandCapacity();
	
	stack[top] = element;
	top++;
}

public void expandCapacity() {
	stack = Arrays.copyOf(stack, stack.length * 2);
}

public T pop() throws EmptyCollectionsException {
	
	if (isEmpty())
		throws new EmptyCollectionsException("stack");
	
	
}




}



