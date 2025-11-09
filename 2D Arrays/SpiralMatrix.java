import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        
        int[][] spiralMatrix = new int[4][4];
        int startRow=0, startCol=0, endRow=spiralMatrix.length-1, endCol=spiralMatrix[0].length-1;  

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<spiralMatrix.length; i++) {
            for(int j=0; j<spiralMatrix[0].length; j++) {
                System.out.print("Enter element " + i+1 + ": ");
                spiralMatrix[i][j] = sc.nextInt();
            }
        }
        while(startCol <= endCol && startRow <= endRow) {

            // Top
            for(int i=startCol; i<=endCol; i++) {
                System.out.print(spiralMatrix[startRow][i] + " ");
            }

            // Right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(spiralMatrix[i][endCol] + " ");
            }

            // Bottom
            for(int i=endCol-1; i>=startCol; i--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(spiralMatrix[endRow][i] + " ");
            }

            // Left
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(spiralMatrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        sc.close();
    }
}
