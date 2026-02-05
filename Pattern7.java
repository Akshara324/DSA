import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row:");
        int r = sc.nextInt();
        int space = 0;
        int star = r;
        int i = 1;
        while(i<=r) {
            int j = 1;
            while(j<=space) {
                System.out.print(" ");
                j++;
            }
            int n = 1;
            while(n<=star) {
                System.out.print("*");
                n++;
            }
            System.out.println();
            space+=2;
            star--;
            i++;
        }
    }
}