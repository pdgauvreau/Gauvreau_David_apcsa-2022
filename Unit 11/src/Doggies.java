//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{

		System.out.print ("How many dogs are there? :: ");
		size = keyboard.nextInt();
		pups = pups(size);
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		for(int i = 0; i < pups.length; i++) {
			if( )
		}
		return null;
	}

	public String getNameOfYoungest()
	{
		return null;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}