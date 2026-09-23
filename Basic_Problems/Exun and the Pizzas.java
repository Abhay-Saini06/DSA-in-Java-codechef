import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int R = input.nextInt();
		int remaining = N-K;
		System.out.print(remaining*R);
	}
}
