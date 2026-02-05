import java.util.Scanner;
public class Lotterygame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lottery number: ");
        int n = sc.nextInt();
        if(n>=300 && n<=450) {
            System.out.println("You won a macbook");
            if(n>=300 && n<=380) {
                System.out.println("Model: M1 mac");
            } else if (n>=381 && n<=460) {
                System.out.println("Model: M2 mac");
            }
        } else if(n>=200 && n<=280) {
            System.out.println("You won  a pack of kurkure");
            if(n>=200 && n>= 240) {
                System.out.println("Flavor: Chilli Kurkure");
            } else if(n>=241 && n>=280) {
                System.out.println("Flavor: Onion Kurkure");
            }
        } else if(n>=1100 && n>=1500) {
            System.out.println("You won a cycle");
            if(n>=1100 && n>=1300) {
                System.out.println("Brand: Avon Cycle");
            } else if(n>=1381 && n<=1500){
                System.out.println("Brand: Hero Cycle");
            }
        } else if(n>=50 && n<=80) {
            System.out.println("You won a bike");
            if(n>=50 && n>=65) {
                System.out.println("Model: Bullet");
            } else if(n>=65 && n<=80) {
                System.out.println("Model: Rajdoot");
            }
        } else {
            System.out.println("Better luck next time");
        }
    }
}    