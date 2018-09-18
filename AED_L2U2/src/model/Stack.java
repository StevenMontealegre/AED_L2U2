package model;

import java.util.ArrayList;

public class Stack<T> {

	private  ArrayList<Weapon> stack;

	public Stack( ) {
		stack = new ArrayList<Weapon>();
		Weapon w = new Weapon("Axe", "Axe");

		Weapon q = new Weapon("Lop", "Gray");
		push( w);
		push( q);
	}
	
	
	public int size()
	{
		return stack.size();
	}
	public void push( Weapon element)
	{
		stack.add(0, element);
	}
	
	public Weapon top()
	{
		return stack.get(0);
	}
	
	public Weapon pop()
	{
		Weapon top = stack.get(0);
		stack.remove(0);
		return top;
	}
	
	public ArrayList<Weapon> getStack()
	{
		return stack;
	}
	
	//We do not need the isEmpty() method because we know that the player at least always have an ax, so the stack will never be empty 
	


}
