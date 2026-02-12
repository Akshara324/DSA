public class Pattern4void {
    public static void printPattern() {

        int rows = 4;
        int cols = 4;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                if(i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}

