public class Patternvoid {

    // void function to print pattern
    public static void printPattern() {
        for(int i = 1; i <= 5; i++) {      
            for(int j = 1; j <= 5; j++) {  
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}
