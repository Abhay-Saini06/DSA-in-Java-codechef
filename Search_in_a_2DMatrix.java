import java.util.*;

public class Search_in_a_2DMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) return;
        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int target = input.nextInt();

        if (SearchMatrix(arr, target)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean SearchMatrix(int[][] arr, int target) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) return false;
        
        int rows = arr.length;
        int columns = arr[0].length;

        int st = 0;
        int end = rows * columns - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midValue = arr[mid / columns][mid % columns];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}