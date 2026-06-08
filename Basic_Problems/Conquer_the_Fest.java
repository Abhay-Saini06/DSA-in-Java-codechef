import java.util.Scanner;

public class Conquer_the_Fest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        if (N >= 10 * B) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}