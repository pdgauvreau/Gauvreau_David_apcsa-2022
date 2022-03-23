package FRQ;

public class Latinsquare {

}


public static int[] getColumn(int[][] arr2D, int c)
{
 int[] result = new int[arr2D.length];
 for (int r = 0; r < arr2D.length; r++)
 {
 result[r] = arr2D[r][c];
 }
 return result
}
 
 public static boolean isLatin(int[][] square)
 {
  if (containsDuplicates(square[0]))
  {
  return false;
  }
  for (int r = 1; r < square.length; r++)
  {
  if (!hasAllValues(square[0], square[r]))
  {
  return false;
  }
  }
  for (int c = 0; c < square[0].length; c++)
  {
  if (!hasAllValues(square[0], getColumn(square, c)))
  {
  return false;
  }
  }
  return true;
 }
