package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Stack;
import model.Weapon;

public class StackTest  {

	
	private Stack stack;
	private Weapon weapon;
	
	public void setUp1()
	{
		stack = new Stack();
		weapon = new Weapon("1Blue");
	}
	
	public void setUp2()
	{
		stack = new Stack();
		Weapon weapon1 = new Weapon("1Blue");
		Weapon weapon2 = new Weapon("2Blue");
		Weapon weapon3 = new Weapon("3Blue");
		Weapon weapon4 = new Weapon("4Blue");
		
		stack.push(weapon1);
		stack.push(weapon2);
		stack.push(weapon3);
		//Last element added
		stack.push(weapon4);
	}

	@Test
	public void pushTest()
	{
		setUp1();
		int a = stack.size();
		stack.push(weapon);
		a++;
		assertEquals(a,stack.size());
	}
	
	@Test
	public void sizeTest()
	{
		setUp2();
		assertEquals(4,stack.size());
	}
	
	
	@Test 
	public void topTest()
	{
		setUp2();
		assertEquals("4Blue",stack.top().getName());
	}
	
	@Test 
	public void popTest()
	{
		setUp2();
		int a = stack.size();
		stack.pop();
		a--;
		assertEquals(a,stack.size());
	}
	

	
	
}
