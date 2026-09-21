import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		String S = input.next();
		char[] arr = S.toCharArray();
		if(arr[0] == 'c' || arr[S.length()-1] == 'f'){
		    System.out.print("Yes");
		    
		}else{
		    System.out.print("No");
		    
		}
	    
	}
		
}
