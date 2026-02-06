import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n-1;
        int r = 1;
        while(r <= n) {
            int i = 1;
            while(i<=space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while(j<=star) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            space--;
            star=star+2;
            r++;
        }
    }
}