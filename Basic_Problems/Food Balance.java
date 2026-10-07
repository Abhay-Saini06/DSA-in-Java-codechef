import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int F1 = sc.nextInt();
        int P1 = sc.nextInt();
        int F2 = sc.nextInt();
        int P2 = sc.nextInt();

        int diff1 = Math.abs(F1 - P1);
        int diff2 = Math.abs(F2 - P2);

        if (diff1 < diff2) {
            System.out.println("First");
        } 
        else if (diff2 < diff1) {
            System.out.println("Second");
        } 
        else {
            System.out.println("Both");
        }
    }
}
