//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i).equals(str.substring(i + 1)));{
				count = count + 1;
			}
		}
		return count;
	}
}