import java.util.Scanner;
public class Minsubarray{
public static int minInSubarray(int[] nums, int L, int R) {
    int min = Integer.MAX_VALUE;

    for (int i = L; i <= R; i++) {
        if (nums[i] < min) {
            min = nums[i];
        }
    }

    return min;
}
}
