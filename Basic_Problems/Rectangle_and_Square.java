
import java.util.*;
import java.lang.*;
import java.io.*;

public class Rectangle_and_Square
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int RecArea = A*B;
		int SquArea = C*C;
		if(RecArea == SquArea){
		    System.out.print("Yes");
		}else{
		    System.out.print("No");
		}

	}
}
