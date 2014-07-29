
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class SABER {
	private static final int index = 0;
	public static Scanner input = new Scanner(System.in);
	public static String message;
	public static int guesses = 2;

	public static void main(String[] args) 
	{
		startGame();
	}
	
	public static void guess(char[] x1)
	{
		if(guesses > 0)
		{
			
			JOptionPane.showMessageDialog(null, "The coded message is: " + new String(x1));
			String answer = JOptionPane.showInputDialog("Make a guess. " + new String(x1) + " Is your word" );
			if(message.equals(answer))
			{
				JOptionPane.showMessageDialog(null, "!YOUR RIGHT!");
			}
			else
			{
				guesses = guesses - 1;
				JOptionPane.showMessageDialog(null, "Sory thats not right Try agin?\n You have " + guesses + " guesses left.");
				
				guess(x1);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Out of guesses. restart");
			startGame();
		}
	}
	public static void startGame()
	{
		String name1 = null;
		name1 = JOptionPane.showInputDialog("Please enter your name");
		if (name1 != null)
		{
			JOptionPane.showMessageDialog(null, "Hi " + name1 + " click OK to get started" );
			JOptionPane.showMessageDialog(null, "To play you need 2 people");
			JOptionPane.showMessageDialog(null, "How to play: "
					+ "player 1 enter a secret message in the space provided");
			JOptionPane.showMessageDialog(null, "player 2 "
					+ "try to gess the encripted message "
					+ "player 1 may give hints if chosen");
			char[] x1;
			message = JOptionPane.showInputDialog("Please enter the message.");
			x1 = message.toCharArray();
			String key = JOptionPane.showInputDialog(("Enter the encription key "));
			int keynum = Integer.parseInt(key);
			for (int index = 0; index < x1.length; index++){
			x1[index] += keynum ;
			}
			JOptionPane.showMessageDialog(null, "!SABER!");
			for(int i = 0; i < 100; i++)
			{
			System.out.println();
			}	
			guess(x1);
		}
	}
	private static char String(char[] x1) {
		return 0;
	}
}


