import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 1;
        for(int i =2; i<n; i++) {
            if(n%i==0) {
                prime=0;
                break;
            }
        }
            if(prime==1) {
                System.out.println(n + " is a prime number");
            }
            else {
            System.out.println(n + " is not a prime number");
        }
    }
}
