//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		if (num < 10)
		{
			if (num % 2 == 0) return 1;
			else return 0:
		}
		if (num % 2 == 0)
		{
			return countOddDigits(num / 10) + 1;
		}
		else return countOddDigits(num / 10);
	}
}