package zork;

public class poiint
{
	public int y;
	public int y2;
	public int x;
	public int x2;
	public poiint (int x,int y)
	{
		this.x = y;
		this.y = y;
	}
	public boolean equals(poiint other) 
	{
		if(this.x == other.x && this.y == other.y)
		return true;
		else return false;
	}
	
}