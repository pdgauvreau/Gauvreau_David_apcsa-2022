//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect(int i) {
		
	}
	//add a set method
public void setNum(int num) {
	int num = number
	
}
	public boolean isPerfect()
	{
		int sum = 0;
		for (int i = 2; i <= (number/2);i++ )
		{
			if (number % i == 0) 
				sum = sum + i; 
		}
		if (sum == number) return true;
		
		return false;
	}

	//add a toString	
	public String toString()
	{
		if(isPerfect())
			return number + " is a perfect number";
		else return number + " is not a perfect number";
	}
}