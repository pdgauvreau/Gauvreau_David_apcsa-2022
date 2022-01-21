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
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
	}

	public void setNums(int dist, int hrs, int mins)
	{
	}

	public void calcMPH()
	{
		int mins = 0;
		int hrs = 0;
		int dist = 0;
		double MPH = 0; 
		double doubleHours = 0.0;
		doubleHours = ( mins / 60 ) + hrs;
		MPH = dist / doubleHours;
		
	}

	public void print()
	{
		public int getDist();
		int hrs;
		int mins;
		int MPH;
		System.out.print( hrs +" hours and "+ mins + "minutes =" + MPH + "miles per hour");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}