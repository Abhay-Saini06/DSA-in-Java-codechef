import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		if(A+B>C && B+C>A && A+C>B){
		    System.out.print("Yes");
		}else{
		    System.out.print("No");
		}
	}
}
