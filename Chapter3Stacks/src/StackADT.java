
public interface StackADT<T> {
	
	public void push (T elements);

	public T pop();
	
	public T peak();
	
	public boolean isEmpty();
	
	public int size();
	
	public String toString();
	
	
}

