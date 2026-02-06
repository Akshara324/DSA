import java.util.Scanner;
public class Pyramid4 {
    public static void main(String[] args) {

        int n = 5;

        // upper part
        for(int i = n; i >= 1; i--) {

            // left side stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // space between two groups
            for(int s = 1; s <= (n - i) * 4; s++) {
                System.out.print(" ");
            }

            // right side stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
