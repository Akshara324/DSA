import java.util.Scanner;
public class Sumofnreturn {
    public static int sum(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = sum+i;
        }
        return(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sum(n);
        System.out.println(c);
    }
}
