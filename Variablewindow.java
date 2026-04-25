import java.util.Scanner;;
public class Variablewindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt(); 
        }
        int givensum = sc.nextInt();
        int sum = 0;
        int j = 0;
        int i = 0;
        int ans = 0;
        while(j<n) {
            sum = sum+arr[j];
            if(sum < givensum) {
               j++;
            }
            else {
                while(sum>givensum) {
                    sum = sum-arr[i];
                    i++;
                }
                ans = Math.max(ans, j-i+1);
                j++;
            }
        }
        System.out.println(ans);
    }
}
