package bbb;


import java.util.Random;

public class dd 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		float switchWin = 0;
		float stayWin = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			int cardoor = r.nextInt(3);
			int choosedoor = r.nextInt(3);
			
			if(cardoor == choosedoor)
			{
				stayWin ++;
			}
			else
			{
				int revdoor = 0;
				for(int j = 0; j < 3; j++)
				{
					if(j != cardoor && j != cardoor)
					{
						revdoor = j;
					}
				}
				for(int k = 0; k < 3; k++)
				{
					if(k != choosedoor && k != revdoor)
					{
						choosedoor = k;
						break;
					}
				}
				
				if(cardoor == choosedoor)
				{
					switchWin ++;
				}
			}
		}
		System.out.println("Chance of wining after staying: " + stayWin/1000 * 100 + "%");
		System.out.println("Chance of wining after staying: " + switchWin/1000 * 100 + "%");
	}
}
