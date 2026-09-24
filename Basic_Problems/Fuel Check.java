import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();

        int distance = X * Y;

        if(distance >= 100){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
