//(c) A+ Computer Science
//www.apluscompsci.com
//Name - P. David Gauvreau
//Date - 1/20/2022

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double Slope = 0.0; 
		Slope = ((y2 - y1) / (double)(x2 - x1));
		return Slope; 
	}

}