import java.util.Scanner;
public class Loopp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of d:");
        int d = sc.nextInt();
        for(int i = 1; i<=50; i++) {
            int term = a+(i-1)*d;
            System.out.println(term + " ");
        }
    }
}
