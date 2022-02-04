//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice=compChoice="";
	}

	public RockPaperScissors(String player)
	{
		int choice = (int)(Math.random()*3);
		switch(choice)
		{
			case 0 = compChoice = "R"; break;
			case 1 = compChoice = "P"; break;
			case 2 = compChoice = "S"; break;
		}
		playChoice=player;
	}

	public void setPlayers(String player)
	{
		int choice = (int)(Math.random()*3);
		switch(choice)
		{
			case 0 = compChoice = "R"; break;
			case 1 = compChoice = "P"; break;
			case 2 = compChoice = "S"; break;
		}
		compChoice=player;
	}

	public String determineWinner()
	{
		String winner= "The winner is" + ___ ;
		if(compChoice.equals(playChoice))
			return "draw";
		if (playChoice == "R" && compChoice == "S") return winner + "the player!";
		if (playChoice == "P" && compChoice == "R") return winner + "the player!";
		if (playChoice == "S" && compChoice == "P") return winner + "the player!";
		else return winner + "the computer :(";
		
	}

	public String toString()
	{
		String output="";
		return output;
	}
}