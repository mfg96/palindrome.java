import java.util.Scanner;
import java.lang.String;

public class palindrome {

		/**
		 * checking for palindrome method
		 * @param cc
		 * @return boolean
		 */
	public static boolean isPalindrome(String cc) {
		int c=cc.length();
		String str="";
		for(int i=c-1;i>=0 ; i--){
				
			str=str+cc.charAt(i);
			//System.out.println(str);
		}
		if(cc.equalsIgnoreCase(str))
			return true;
		else 
			return false;
	}
	
	/**
	 * checking for being mirror method
	 * @param mm
	 * @return boolean
	 */
	public static boolean isMirror(String mm){
		
		int length= mm.length();
	    // array for mirror elements
		char[][] a={{'A','E','H','I','J','L','M','O','S','T','U','V','W','X','Y','Z','1','2','3','5','8'},
					{'A','3','H','I','L','J','M','O','2','T','U','V','W','X','Y','5','1','S','E','Z','8'}};	
			
		int len = a[0].length;
		
		int flag=1;//flag to check the digit 
		//loop to check individual digits
		for (int i=0;i<length;i++)
		{							//outer for loop starts
			for (int j=0;j<len;j++)
			{ 						//inner for loop starts
				if(flag==len)
				{
					return false;
				}
				if(mm.charAt(i)==a[0][j])
				{
					if(mm.charAt(length-i-1)==a[1][j])
					{
						flag=1;
						break;
					}
					else
					{
						return false;
					}
				}
				else
				{
					flag++;
					continue;
					
				}
			}//inner for loop ends
		}//outer for loop ends
		
		return true;
	}
	
	/**
	 * to string method
	 * @param m
	 * @param n
	 */
	public void toString(boolean m, boolean n)
	{
		// if else for checking and printing the result
		if(m==true&&n==true)
		{
			System.out.println("--It is a mirrored palindrome");
		}
		else if(m==true&&n==false)
		{
			System.out.println("--It is a palindrome");
		}
		else if(n==true&&m==false)
		{
			System.out.println("--It is a mirrored string ");
				
		}
		else
		{
			System.out.println("--It is neither a mirror string  nor a palindrome");
		}
	}}