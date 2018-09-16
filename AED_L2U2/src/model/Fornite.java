package model;

public class Fornite {
	
	private Stack stack;
	
	public Fornite() {
	
	}
	
	
	public void createWeaponStack()
	{
		stack = new Stack<Weapon>();
		Weapon axe = new Weapon(0, "axe");
		
	}

}
