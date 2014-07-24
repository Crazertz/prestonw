package zork;
import java.util.Scanner;

public class main
{
	private static Player p;
	private static Treasure t;

	public static void main(String []args)
	{
		p = new Player("skippy", new poiint (0,0));
		t = new Treasure(new poiint(5,5));
		Scanner input = new Scanner(System.in);
		
		while(!p.position.equals(t.location))
		{
			System.out.println("type a direction");
			p.move(input.nextLine());
			System.out.println(p.position.x + ", " + p.position.y);
		}
		System.out.println();
	}
}
