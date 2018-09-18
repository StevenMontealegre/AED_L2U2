package model;

import javafx.beans.property.SimpleStringProperty;

public class Weapon {

	public final static int GRAY = 0;
	public final static int GREEN = 1;
	public final static int BLUE = 2;
	public final static int PURPLE = 3;
	public final static int ORANGE = 4;
	public final static int GOLD = 5;
	
	

	private int type;
	private int color;
	private int state;
	private String name;
	
	
	public Weapon( String name, String col)
	{
	
		this.color = classifyColor(col);
		this.state = color + 2;
		this.name = name;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int classifyColor(String col)
	{
		int c = 0;
		switch(col)
		{
		case "Gray":
			c = GRAY;
			break;
		case "Green":
			c = GREEN;
			break;
		case "Blue":
			c = BLUE;
			break;
		case "Purple":
			c = PURPLE;
			break;
		case "Gold":
			c = GOLD;
			break;
		default: c = 100000;
		break;
			
		}
		
		return c;
	}
	
	
	public boolean useWeapon()
	{
		boolean availibility;
		if ( state > 0)
		{
			availibility = true;
			state --;
			System.out.println(state);
		}
		else 
		{
			availibility = false;
		}
		return availibility;
	}

}
