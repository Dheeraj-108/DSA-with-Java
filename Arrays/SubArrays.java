public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {-3, 4, 7, -4, 8, 1, -5, 6};
        int highestSubArraySum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length-1; i++) {  // Sets the start point for the subarray
            for(int j=i+1; j<arr.length; j++) {  // Sets the end point for the subarray
                int subArraySum = 0;

                System.out.print("(");
                for(int k=i; k<=j; k++) {      // Creates one subarray each time it runs
                    System.out.print(arr[k]+ ","); 
                    subArraySum += arr[k]; 
                }
                System.out.print("),");

                if(highestSubArraySum < subArraySum) {  // Sets the highest value of the sum of subarray
                    highestSubArraySum = subArraySum;
                }
                System.err.println("Subarray Sum: " + subArraySum);
                
            }
        }

        System.err.println("\n\nHighest Subarray sum is: " + highestSubArraySum);
    }
}
