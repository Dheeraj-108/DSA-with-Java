import java.util.Scanner;

public class BinarySearch {

    public static int searchArray(int[] arr, int target) {
        int start = 0, end = arr.length-1, mid;
        
        while(start <= end) {
            mid = (start+end)/2;

            if(target == arr[mid]) {
                return mid;
            } 
            
            if(target > arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int sortedArray[] = {11,22,33,44,55,66,77,88,99};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();

        int res = searchArray(sortedArray, target);
        if(res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + res);
        }
        
        sc.close();
    }
}
