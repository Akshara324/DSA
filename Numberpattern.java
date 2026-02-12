import java.util.Scanner;
public class Numberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row:");
        int r = sc.nextInt();
        int space = r-1;
        int star = 1;
        for(int row=1; row<=r; row++) {
            for(int i=1; i<=space; i++) {
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print(row);
            }
            System.out.println();
            space --;
            star+=2;
        }
    }
}
