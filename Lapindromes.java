import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
	    int T = input.nextInt();
	    while(T-->0){
	        
		String s = input.next();
		int n = s.length();
		int half = n/2;
		HashMap <Character,Integer> left = new HashMap<>();
		HashMap <Character,Integer> right = new HashMap<>();
		for(int i = 0;i<half;i++){
		    char c = s.charAt(i);
		    left.put(c,left.getOrDefault(c,0)+1);
		}
		int start;
		if(n%2 != 0){
		    start = half+1;
		}else{
		    start = half;
		}
		for(int i = start;i<n;i++){
		    char c = s.charAt(i);
		    right.put(c,right.getOrDefault(c,0)+1);
		}
		if(left.equals(right)){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	    }
	}
}
