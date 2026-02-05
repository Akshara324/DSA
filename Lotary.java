//you are given a number n 
//you have to determine what the person wins based on condition

import java.util.Scanner;
public class Lotary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lottery number: ");
        int n = sc.nextInt();
        if(n>=300 && n<=460) {
            System.out.println("The prize is macbook");
        } else if (n>=200 && n<=200) {
            System.out.println("The prize is kurkure");
        } else if (n>=1100 && n<=1500) {
            System.out.println("The prize is cycle");
        } else if (n>=50 && n<=80) {
            System.out.println("The prize is bike");
        } else {
            System.out.println("Better luck next time");
        } 
    }
}