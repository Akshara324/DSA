import java.util.Scanner;
public class Slidingwindow {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        int j = 0;
        int i = 0;
        int ans = 0;
        while(j<n) {
            if(j-i+1<=k) {
                sum+=arr[j];
                j++;
            }
            else {
                ans = Math.max(ans, sum);
                sum+=arr[j];
                j++;
                sum-=arr[i];
                i++;
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
}