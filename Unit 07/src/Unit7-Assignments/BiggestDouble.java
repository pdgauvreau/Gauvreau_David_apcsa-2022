//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		double max = 0;
		if (a > max) max = a;
		if (b>max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		double biggestDouble = max; 
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a; 
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		
		return 0.0;
	}

	public String toString()
	{
	   return "biggest = " + biggestDouble;
	}
}