import java.util.Scanner;
public class File5 {
    public static void main(String[] args) {
        String s = "CodingBlocks";
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                String x = s.substring(i, j);
                System.out.println(x);
            }
        }
    }
}
