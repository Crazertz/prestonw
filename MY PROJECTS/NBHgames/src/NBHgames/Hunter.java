package NBHgames;

import java.util.Random;

public class Hunter extends Combatant
{
	String name;
	point position;
	public Hunter(String n, point p) 
	{
		super(n,p);
		this.setSpeed(1);
	}
}
