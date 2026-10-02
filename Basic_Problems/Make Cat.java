import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        if (new String(arr).equals("act"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
