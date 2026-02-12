public class Pattern2return {
    public static String getPattern() {
        String result = "";

        for(int i = 5; i >= 1; i--) {      
            for(int j = 1; j <= i; j++) {  
                result += "*";
            }
            result += "\n"; 
        }
        return result;
    }

    public static void main(String[] args) {
        String pattern = getPattern();
        System.out.print(pattern);
    }
}

