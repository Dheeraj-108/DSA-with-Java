import java.util.*;

public class ArrayInFunction {
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("All elements are printed");
    }
    public static void main(String args[]) {
        int marks[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<marks.length; i++) {
            System.out.print("Enter the value: ");
            marks[i] = sc.nextInt();
        }
        sc.close();

        printArray(marks);
    }
}
