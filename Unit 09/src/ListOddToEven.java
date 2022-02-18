//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	ArrayList <Integer> ray;
	ray = new ArrayList<Integer>();

	int x = 0;
	int y = 0;
	int sum = -1;		
	for(int i = 0; i < ray.get.length; i++) {
		if(ray.get(i) % 2 != 1) sum = -1;
		
		else if (ray.get(i) % 2 != 0) {
			x = i; 
			for (int d = x; d < ray.get.length; d++) {
				if (ray.get(d) % 2 == 0) {
					y = d;
					sum = 0;
					sum = y - x;
					return sum;
				}
			}
		}
	}
return sum;
}




