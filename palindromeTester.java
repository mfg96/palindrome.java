import java.util.*;
public class palindromeTester
{
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		String str=new String();
		palindrome pal=new palindrome();
		while(s.hasNext())
		{
			str=s.next();
			processLine(str);
			boolean m= pal.isPalindrome(str);
			boolean n= pal.isMirror(str);
			pal.toString(m,n);
		}
		s.close();
	}
		
		/**
		 * printing process caption
		 * @param line
		 */
	public static void processLine(String line)
	{
		System.out.println("processing "+line);
	}
		  
		  
}
	
	
	