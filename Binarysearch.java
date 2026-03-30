import java.util.Scanner;
public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]arr = new int[n][m];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int count = 0;
        int i = 0;
        int j = n-1;
        while(i<m && j>=0) {
            if(arr[i][j] == target) {
                System.out.println("Target found at index:" + i+" "+j);
                count ++;
                break;
            }
            else if(arr[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        if(count <=0) {
        System.out.println("Target is not present in the array");
        }
    }
}