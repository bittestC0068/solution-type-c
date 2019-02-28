package problem03;

import java.util.Arrays;

public class MyStack {
	
	private String[] buffer;
	private int top;

	public MyStack( int size ) {
		top = -1;
		buffer = new String[size];
	}
	
	public void push(String item) {
		buffer[++top] = item;
		if(!isEmpty()) {
			buffer = Arrays.copyOf(buffer, size());
		}
	}

	public String pop() {
		if(top != -1) {
		return buffer[top--];
		}
		return null;
	}

	public boolean isEmpty() {
		return top == -1;
		}
	
	public int size() {
		return 2*buffer.length;
	}
}