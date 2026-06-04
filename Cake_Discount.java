import java.util.*;
import java.lang.*;
import java.io.*;

public class Cake_Discount
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N >= 5)
            System.out.println(N * 85);
        else
            System.out.println(N * 100);
    }
}