//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
 private int rOne;
 private int rTwo;
	//write two constructors
public void rational (int rOne) {
	rOne = 0;
}
 
public void number (int rTwo) {
	rTwo = 0;
}
	//write a setRational method
public void setRational(int num1, int den1) {
	
}
	//write  a set method for numerator and denominator
public void setFraction(int num1, int den1, int num2, int den2) {
	num1 = 0;
	den1 = 0;
	num2 = 0;
	den2 = 0;
}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
	
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}