import java.util.Scanner;
public class Numberpattern1 {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int s = rows - i; s > 0; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}