import java.util.Scanner;
public class File3 {
    public static void main(String[] args) {
        String S1 = "Komal Sharma";
        String S2 = "Kunal";
        for(int i=0; i<S1.length(); i++) {
            System.out.print(S1.charAt(i)+" ");
        }
        System.out.println();
        for(int j=0; j<S2.length(); j++) {
            System.out.print(S2.charAt(j)+" ");
        }
        System.out.println();
        System.out.println(S1.compareTo(S2));
    }
}
