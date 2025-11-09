public class LargestInArray {

    public static int findLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        int intArray[] = {44, 66, 22, 77, 55, 11, 33, 88};
        
        int res = findLargestElement(intArray);
        System.out.println("Largest element is: " + res);
    }
}
