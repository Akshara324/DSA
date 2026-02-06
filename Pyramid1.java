import java.util.Scanner;
public class Pyramid1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n-1;
        for(int row=1; row<=n; row++) {
            for(int i = 1; i<=space; i++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                if(j%2==1){
                    System.out.print("* ");
                }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
        space--;
        star = star+2;
    }
}
}