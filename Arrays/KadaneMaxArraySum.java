public class KadaneMaxArraySum {
    public static void main(String[] args) {
        int maxSubArraySum = Integer.MIN_VALUE;
        int subArraySum = 0;

        int[] arr = {-3, 4, 7, -4, 8, 1, -5, 6};

        for(int i=0; i<arr.length; i++) {
            subArraySum += arr[i];

            if(subArraySum < 0) {
                subArraySum = 0;
            }
            maxSubArraySum = Math.max(subArraySum, maxSubArraySum);
        }

        System.out.println("Max subarray sum is: " + maxSubArraySum);
    }
}
