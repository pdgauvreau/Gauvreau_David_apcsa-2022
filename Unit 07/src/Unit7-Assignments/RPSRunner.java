//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do {
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("Choose your weapon! [R,P,S] :: ");
			RockPaperScissors test = new RockPaperScissors(keyboard.nect());
			System.out.println(test);
			System.out.println(test.determineWinner()+"\n");
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();
		}
	}
}



