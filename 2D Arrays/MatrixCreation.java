import java.util.Scanner;

public class MatrixCreation {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
