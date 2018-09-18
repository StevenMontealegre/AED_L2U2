package test;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Stack;
import model.Weapon;

public class StackTest extends TestCase {

	
	private Stack stack;
	
	public void setUp1()
	{
		stack = new Stack();
	}
	
	@Test
	public void pushTest()
	{
		setUp1();
		int a = stack.size();
		stack.push(new Weapon("abc", "Gray"));
		System.out.println(a);
		a++;
		assertEquals(a, stack.size());
		System.out.println(stack.size());
		
	}
	
}
