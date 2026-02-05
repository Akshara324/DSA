import java.util.Scanner;
public class Pattern1 {
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows:");
    int row = sc.nextInt();
    int i = 1;
    while(i<=row) {
        int j = 1;
        while(j<=row) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
}
}