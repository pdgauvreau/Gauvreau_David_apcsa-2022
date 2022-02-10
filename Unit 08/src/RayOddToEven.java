//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static boolean go(int[] ray)
	{
		for (int i = 0; i < ray.length; i++)
			if (!(ray[i] % 2  == 1)) return "-1";
			else for (int j = i; j < ray.length -1; j++)
				if (ray[j] % 2 == 0) return  j - i + " "; 
		
	}
}