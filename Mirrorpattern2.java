import java.util.Scanner;
public class Mirrorpattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int star = r-1;
        int space = 1;
        for(int row=1; row<=2*r-1; row++) {
            for(int j=1; j<=star; j++) {
                System.out.print("* ");
            }
            for(int i=1; i<=space; i++) {
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++) {
                System.out.print("* ");
            }
            System.out.println();
            if(row<r) {
                star--;
                space +=2;
            }
            else {
                star++;
                space -=2;
            }
        }
    }
}