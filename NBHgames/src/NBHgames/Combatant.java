package NBHgames;


public class Combatant
{
	String name;
	point position;
	boolean isDead;
	public Combatant(String n,point p)
	{
		this.name = n;
		this.position = p;
		
	}
	public void move()
	{
		
	}
	public void fight(Combatant other)	
	{
		if(this.isDead || other.isDead)
		{
			return;
		}
		if(this instanceof Ninja)
		{
			if(other instanceof Hunter)
			{
				other.isDead = true;
			}
		}
	}
	
}

