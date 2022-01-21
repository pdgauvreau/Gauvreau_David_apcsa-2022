//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		double MPH = mph;
	}

	public void setNums(int dist, int hrs, int mins)
	{
	 dist = distance;
	 hrs = hours;
	 mins = minutes;
	}

	public void calcMPH()
	{
		double doubleHours = 0.0;
		doubleHours = ( mins / 60 ) + hrs;
		MPH = dist / doubleHours;
	}

	public void print()
	{
		
		System.out.print( hrs +" hours and "+ mins + "minutes =" + mph + "miles per hour");
	}
}