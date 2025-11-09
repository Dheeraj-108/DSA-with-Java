import java.util.Scanner;

public class DiagonalMatrixSum {
    public static void main(String[] args) {
        int matrixSize = Integer.parseInt(args[0]);
        int[][] diagonalMatrix = new int[matrixSize][matrixSize];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<diagonalMatrix.length; i++) {
            for(int j=0; j<diagonalMatrix[0].length; j++) {
                System.out.print("Enter element " + i+1 + ": ");
                diagonalMatrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<diagonalMatrix.length; i++) {
            for(int j=0; j<diagonalMatrix[0].length; j++) {
                System.out.print(diagonalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int diagonalSum = 0;
        for(int i=0; i<diagonalMatrix.length; i++) {
            for(int j=0; j<diagonalMatrix.length; j++) {
                if(i == j || i + j == diagonalMatrix.length -1) {
                    diagonalSum += diagonalMatrix[i][j];
                    System.out.println("\n" +diagonalMatrix[i][j]);
                }
            }
        }

        // Optimized Code Logic

        // for(int i=0; i<diagonalMatrix.length; i++) {
        //      diagonalSum += diagonalMatrix[i][i];

        //      if(i != diagonalMatrix.length-1-i) {
        //         diagonalSum += diagonalMatrix[i][diagonalMatrix.length-1-i];
        //      }
        // }

        System.out.println("Diagonal Sum is: " + diagonalSum);

        sc.close();
    }
}
