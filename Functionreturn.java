import java.util.Scanner;
public class Functionreturn {
    public static int add(int a, int b) {
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = add(a,b);
        System.out.println(c);
    }
}
