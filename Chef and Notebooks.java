import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();
            int N = sc.nextInt();

            int required = X - Y;
            boolean possible = false;

            for (int i = 0; i < N; i++) {

                int pages = sc.nextInt();
                int price = sc.nextInt();

                if (pages >= required && price <= K) {
                    possible = true;
                }
            }

            if (possible) {
                System.out.println("LuckyChef");
            } else {
                System.out.println("UnluckyChef");
            }
        }

        sc.close();
    }
}
