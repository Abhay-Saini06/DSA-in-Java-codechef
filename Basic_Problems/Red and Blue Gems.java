import java.util.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);

        int R = input.nextInt();
        int B = input.nextInt();
        int P = input.nextInt();
        int Q = input.nextInt();

        int res1 = R * P;
        int res2 = B * Q;

        if(res1 > res2){
            System.out.println(res1);
        }else{
            System.out.println(res2);
        }
    }
}
