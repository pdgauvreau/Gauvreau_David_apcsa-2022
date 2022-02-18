//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		ArrayList<Integer>ray;
		ray = new ArrayList<Integer>();
		
		int sum = 0;
		int start = ray.get(0);
		for (int i = 0; i < ray.size(); i++) {
			if(ray.get(i) > start) {
				sum = sum +ray.get(i);
			}
		}
		return sum;
	}
}