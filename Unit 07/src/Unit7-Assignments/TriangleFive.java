//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		for (int i = 0; i < amount; i++) {
			print.ln (letter * (amount) + letter * (amount - 1))
		}
			
	}

	public TriangleFive(char c, int amt)
	{
	}

	public void setLetter(char c)
	{
		c = letter; 
	}

	public void setAmount(int amt)
	{
		amt = amount; 
		
	}

	public String toString()
	{
		String output="";
		return output;
	}
}