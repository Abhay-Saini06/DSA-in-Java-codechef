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
		int H = input.nextInt();
		int hours = X-4;
		int hour = hours*24;
		int total = hour+H;
		System.out.print(total);
	}
}
