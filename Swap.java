import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Before swapping: "+a);
        System.out.println("After swapping: "+b);
    }
}

//  reverse an array
// leftshift by 1
// rightshift by 1
