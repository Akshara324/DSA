import java.util.Scanner;

public class Matrixmultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  
        int n = sc.nextInt();  

        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int p = sc.nextInt();  
        int q = sc.nextInt();  

        int[][] B = new int[p][q];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        if (n != p) {
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] C = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}