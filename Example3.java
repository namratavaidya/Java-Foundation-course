package q10946;
import java.util.*;

public class MultiDimArrayPrinter {
    public static void main(String[] args) {
        int[][] int2DArr = {
            {1},
            {2, 3},
            {4, 5, 6},
            {7, 8, 9, 10}
        };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int[] row : int2DArr) {
            for (int value : row) {
                if (value < n) {
                    System.out.print(value + " ");
                }
            }
        }
    }
}
