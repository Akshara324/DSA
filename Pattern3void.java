public class Pattern3void {

    
    public static void printPattern() {

        int rows = 6;

        for(int i = 0; i < rows; i++) {

            
            for(int s = 0; s < i; s++) {
                System.out.print("  ");
            }

            
            for(int j = rows; j > i; j--) {
                System.out.print("*");
            }

            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}

