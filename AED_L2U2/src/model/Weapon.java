package model;

import java.util.Random;

import javafx.beans.property.SimpleStringProperty;

public class Weapon {

	public final static int GRAY = 0;
	public final static int GREEN = 1;
	public final static int BLUE = 2;
	public final static int PURPLE = 3;
	public final static int ORANGE = 4;
	public final static int GOLD = 5;
	
	

	private int type;
	private String color;
	private int state;
	private String name;
	private String stackName;
	
	
	public Weapon( String name)
	{
		
		Random r = new Random();
	
		this.state = classifyColor(name);
		this.name = name;
		
		int randNum = r.nextInt(278332);
		this.stackName = randNum+ " "+color;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getStackName()
	{
		return stackName;
	}
	
	public void useWeapon()
	{
		state--;
		System.out.println("Estado: "+state);
	}
	
	public int getState()
	{
		System.out.println("state get" + state);
		return state;
	}
	
	public int classifyColor(String col)
	{
		int c = 0;
		char b = col.charAt(1);
		char d = col.charAt(2);
		char e = col.charAt(3);
		String two = b+""+d+""+e;
		switch(two)
		{
		case "Gra":
			c = GRAY*4;
			color = "Gray";
			break;
		case "Gre":
			c = GREEN*4;
			color = "Green";
			break;
		case "Blu":
			c = BLUE*4;
			color="Blue";
			break;
		case "Ora":
			c = ORANGE*4;
			color = "Orange";
			break;
		case "Pur":
			c = PURPLE*4;
			color = "Purple";
			break;
		case "Gol":
			c = GOLD*4;
			color="Gold";
			break;
		default: c = 1000000;
		break;
			
		}
		
		return c;
	}
	
	
	
}
