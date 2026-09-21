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
		int Y = input.nextInt();
		int Z = input.nextInt();
		int sum = X+Y;
		int unchip = Z*2;
		int chip = sum-unchip;
		System.out.println(chip);
	}
}
