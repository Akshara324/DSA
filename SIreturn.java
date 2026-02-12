import java.util.Scanner;
public class SIreturn {
    public static int SI(int p, int r, int t) {
        int c = p*r*t/100;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int c = SI(p, r, t);
        System.out.println(c);
    }
}
