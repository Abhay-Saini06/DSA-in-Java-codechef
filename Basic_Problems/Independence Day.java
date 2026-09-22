import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		if(X>15){
		    System.out.print("-1");
		}else{
		    System.out.print(15-X);
		}
	}
}
