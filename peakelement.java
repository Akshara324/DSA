import java.util.Scanner;
public class peakelement {
    public static int peak(int[] arr) {
        int n = arr.length;
        for(int i=1; i< n-1; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = peak(arr);
        System.out.println("The peak element is: "+j);
    }
}
