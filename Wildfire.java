import java.util.Scanner;
import java.util.Arrays;

public class Wildfire {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.print("Enter target: ");
        int tar = input.nextInt();

        int result = sprinkler(arr, tar);

        System.out.println("Minimum distance from target: " + result);
    }

    public static int sprinkler(int[] arr, int tar) {

        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

        
            if (arr[mid] == tar) {
                return 0;
            }

            // move right
            else if (arr[mid] < tar) {
                st = mid + 1;
            }

            // move left
            else {
                end = mid - 1;
            }
        }

        if (end < 0) {
            return arr[st] - tar;
        }

      
        if (st >= arr.length) {
            return tar - arr[end];
        }


        int left = tar - arr[end];
        int right = arr[st] - tar;

        return Math.min(left, right);
    }
} 