import java.util.Scanner;
public class Simpleinterest {
    public static void SI(int p, int r, int t) {
        int c = p*r*t/100;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        SI(p, r, t);
    }
}