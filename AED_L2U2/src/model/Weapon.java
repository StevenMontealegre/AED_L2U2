package model;

public class Weapon {

	public final static int GRAY = 0;
	public final static int GREEN = 1;
	public final static int BLUE = 2;
	public final static int PURPLE = 3;
	public final static int GOLD = 4;
	
	

	private int type;
	private int color;
	private int state;
	
	
	public Weapon( int type, String col)
	{
		this.type = type;
		this.color = classifyColor(col);
		this.state = color + 2;
		
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
		}
		else 
		{
			availibility = false;
		}
		return availibility;
	}

}
