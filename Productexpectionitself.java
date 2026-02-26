import java.util.Scanner;
public class Productexpectionitself {
    public static void product(int[] arr) {
        int n = arr.length;
        int total = 1;
        for(int i=0; i<n; i++) {
            total *= arr[i];
        }
        for(int i=0; i<n; i++) {
            arr[i] = total/arr[i];
        }
        System.out.println("The product of the array expect itself is: ");
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        product(arr);
    }
}
