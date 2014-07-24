package NBHgames;


public class Ninja extends Combatant
{
	String name;
	point position;
	public Ninja(String n, point p)
	{
		super(n,p);
	}
	
	public void move(String input)
		{
		String w = "w";
		String e = "e";
		String s = "s";
		String q = "q";
		if(input.equals(w))
			{
				position.x += 10;
			}
		if(input.equals(e))
			{
				position.y += 10;
			}
		if(input.equals(s))
			{
				position.x -= 10;
			}
		if(input.equals(q))
			{
				position.y -= 10;
			}
		}
}
