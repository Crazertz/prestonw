package NBHgames;

public class point
{
	public int y;
	public int x;
	public point (int x,int y)
	{
		this.x = y;
		this.y = y;
	}
	public boolean equals(point other) 
	{
		if(this.x == other.x && this.y == other.y)
		return true;
		else return false;
	}
	
}