import java.util.Scanner;

public class File6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; // frequency array

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Display result
        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }

        sc.close();
    }
}