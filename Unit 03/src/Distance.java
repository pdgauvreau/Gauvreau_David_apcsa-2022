//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
	}

	public double distance(int x1, int y1, int x2, int y2)
	{
		double distance = Math.sqrt((x2 -x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
	}

	public void calcDistance()
	{
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}