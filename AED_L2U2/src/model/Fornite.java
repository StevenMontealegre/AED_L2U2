package model;

import java.util.ArrayList;

public class Fornite {
	
	private Stack stack;
	
	public Fornite() {
	
	}
	
	
	public void createWeaponStack()
	{
		stack = new Stack();
		System.out.println("Stack to create");
		int a = stack.size();
		stack.push(new Weapon("abc", "Gray"));
		System.out.println("1 " +a);
		
		System.out.println("2 "+stack.size());
		
		
	}
	
	
	public String[] showWeaponsNames()
	{
		String[] names = new String[stack.size()];
		ArrayList<Weapon> s = stack.getStack();
		for(int i = 0; i<s.size();i++)
		{
			
			names[i] = s.get(i).getName();
			System.out.println(names[i]);
				
		}
		return names;
	
	}

}
