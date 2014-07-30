package zork;

public class Player
{
	String name;
	poiint position;
	public Player(String string, poiint poiint) {
		this.name = string;
		this.position = poiint;
	}
	
	public void move(String input)
		{
		String w = "w";
		String e = "e";
		String s = "s";
		String q = "q";
		if(input.equals(w))
			{
				position.x += 1;
			}
		if(input.equals(e))
			{
				position.y += 1;
			}
		if(input.equals(s))
			{
				position.x -= 1;
			}
		if(input.equals(q))
			{
				position.y -= 1;
			}
		}
}
