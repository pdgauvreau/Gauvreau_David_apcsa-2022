 //(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	  if (a.substring(a.length() -1).equals("a")) {
		  return "\n yes";
	  }
	  if (a.substring(a.length() -1).equals("E")) {
		  return "\n yes";
	  }
	  if (a.substring(a.length() -1).equals("i")) {
		  return "\n yes";
	  }
	  if (a.substring(a.length() -1).equals("o")) {
		  return "\n yes";
	  }
	  if (a.substring(a.length() -1).equals("u")) {
		  return "\n yes";
	  }
	  
	
	  return "\n no";
	}
}