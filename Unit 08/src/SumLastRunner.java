//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{		
		int ray[] = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		RaySumLast test = new RaySumLast();
		System.out.println( test.go( new int[]{-99,1,2,3,4,5,6,7,8,9,10,12345}));
		System.out.println( test.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99}));
		System.out.println( test.go( new int[]{10,20,30,40,50,-11818,40,30,20,10}));
		System.out.println( test.go( new int[]{32767}));
		System.out.println( test.go( new int[]{255,255}));
		System.out.println( test.go( new int[]{9,10,-88,100,-555,1000}));
		System.out.println( test.go( new int[]{10,10,10,11,456}));
		System.out.println( test.go( new int[]{-111,1,2,3,9,11,20,30}));
		System.out.println( test.go( new int[]{12,15,18,21,23,1000}));
	}
}