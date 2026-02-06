import java.util.Scanner;
public class Pyramid3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = 2*n-3;
        for(int row=1; row<=n; row++) {
            for(int j=1; j<=star; j++) {
                System.out.print("* ");
            }
            for(int i = 1; i<=space; i++) {
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++) {
                if(k==n) {
                    break;
                } else {
                System.out.print("* ");
                }
                
            }
            System.out.println();
            space-=2;
            star++;
        }
    }
}
