import java.util.Scanner;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        
        int[][] diagonalMatrix = { {10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50} };

        Scanner sc = new Scanner(System.in);
        // for(int i=0; i<diagonalMatrix.length; i++) {
        //     for(int j=0; j<diagonalMatrix[0].length; j++) {
        //         System.out.print("Enter element " + i+1 + ": ");
        //         diagonalMatrix[i][j] = sc.nextInt();
        //     }
        // }

        for(int i=0; i<diagonalMatrix.length; i++) {
            for(int j=0; j<diagonalMatrix[0].length; j++) {
                System.out.print(diagonalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int target = 100;
        int row = 0, col = diagonalMatrix.length-1;
        while(row < diagonalMatrix.length-1 && col >= 0) {
            if(diagonalMatrix[row][col] == target) {
                System.out.println("Key found at index: " + "(" + row + ", " + col + ")");
                break;
            } else if(target < diagonalMatrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        if(row >= diagonalMatrix.length-1) {
            System.out.println("Key not found");
        }

        sc.close();
    }
}
