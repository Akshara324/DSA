import java.util.Scanner;
public class Maximumarraysum {
    public static int findmaximumarraysum(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for(int i=0; i<arr.length; i++) {
            currentsum += arr[i];
            if(currentsum>maxsum) {
                maxsum = currentsum;
            }
            if(currentsum<0) {
                currentsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findmaximumarraysum(arr));
    }
}