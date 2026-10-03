import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X + Y >= A) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
