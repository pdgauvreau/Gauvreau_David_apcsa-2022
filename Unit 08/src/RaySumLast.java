//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		for (int i = 0; i < ray.length; i++) {
			sum = sum + ray[i];
		}
		return sum;
	}
}