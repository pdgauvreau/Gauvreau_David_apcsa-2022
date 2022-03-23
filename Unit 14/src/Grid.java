//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[row].length; col++)
			{
				grid[row][col] = vals[(int)(Math.random()*vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] counts = new int[vals.length];
		
		for (int i = 0; i < vals.length; i++)
		{
			counts[i] = countVals(vals[i]);
		}
		int maxIndex = 0;
		
		for (int counter = 0; counter < vals.length; counter++)
		{
			if (counts[counter] > counts[maxIndex]) maxIndex = counter;
		}
		return vals[maxIndex];
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		return 0;
	}

	//display the grid
	public String toString()
	{
		String output="";
		return output;
	}
}