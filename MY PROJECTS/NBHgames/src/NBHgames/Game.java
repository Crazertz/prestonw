package NBHgames;

import java.util.ArrayList;

public class Game
{
	static ArrayList<Combatant> fight = new ArrayList<Combatant>();
	static boolean stop()
	{
		int dead = 0;
		for(int i = 0;i<fight.size(); i++)
		{
			if(fight.get(i).isDead)
			{
				dead++;
			}
		}
		return dead >= fight.size()-1;
	}
	public static void main(String[] args)
	{
		fight.add(new Bear("b1" , new point(2,2)));
		fight.add(new Bear("b2" , new point(5,4)));
		fight.add(new Ninja("n1" , new point(5,2)));
		fight.add(new Ninja("n2" , new point(7,8)));
		fight.add(new Hunter("h1" , new point(6,7)));
		fight.add(new Hunter("h2" , new point(1,8)));
		
		while(!stop())
		{
			for(int i = 0;i<fight.size(); i++)
			{
				fight.get(i).move();
				for(int j = 0;j<fight.size(); j++)
				{
					if(fight.get(j).position.equals(fight.get(i).position) && !fight.get(j).position.equals(fight.get(i).name))
					{
						fight.get(i).fight(fight.get(j));
					}
				}
			}
		}
	}
}
