package model;

import java.util.ArrayList;

public class Stack<T> {
	
	
	private  ArrayList<T> stack;

	public Stack( ) {
		this.stack = stack;
	}
	
	public void push( T element)
	{
		stack.add(0, element);
	}
	
	public T top()
	{
		return stack.get(0);
	}
	
	public T pop()
	{
		T top = stack.get(0);
		stack.remove(0);
		return top;
	}
	
	//We do not need the isEmpty() method because we know that the player at least always have an ax, so the stack will never be empty 
	


}
