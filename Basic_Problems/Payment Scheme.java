import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int scheme1 = 100 + (4 * X);
        int scheme2 = 300;

        int ans = Math.min(scheme1, scheme2);

        System.out.println(ans);
    }
}
