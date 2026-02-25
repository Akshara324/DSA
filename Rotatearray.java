import java.util.Scanner;
public class Rotatearray {
    public void rotate(int[]arr, int k) {
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    void reverse(int[]arr, int s, int e) {
        while(s<e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println("\nEnter the times to rotate: ");
        int k = sc.nextInt();
        Rotatearray r = new Rotatearray();
        r.rotate(arr, k);
        System.out.println("The rotated array is: ");
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}