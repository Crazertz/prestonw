package NBHgames;

import java.util.Random;


public class Bear extends Combatant 
{
	String name;
	point position;
	public Bear(String n, point p)
	{
		super(n,p);
		this.setSpeed(5);
	}
}
