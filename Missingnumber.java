import java.util.Scanner;
public class Missingnumber {
    public static void missingnumber(int[] arr) {
        int n = arr.length;
        int total = (n*(n+1))/2;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum+= arr[i];
        }
        int missingnumber = total-sum;
        System.out.println("The missing number is: "+ missingnumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        missingnumber(arr);
    }
}
