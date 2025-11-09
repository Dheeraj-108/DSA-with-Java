public class PrefixSubArraySum {
    public static void main(String[] args) {
        int maxSubArraySum = Integer.MIN_VALUE;

        int[] arr = {-3, 4, 7, -4, 8, 1, -5, 6};
        int[] prefixArray = new int[arr.length];

        prefixArray[0] = arr[0];
        for(int i=1; i<prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            int subArraySum = 0;
            for(int j=i; j<arr.length; j++) {
                subArraySum = (i == 0) ? prefixArray[j] : prefixArray[j] - prefixArray[i-1];

                if( maxSubArraySum < subArraySum ) {
                    maxSubArraySum = subArraySum;
                }
            }
        }

        System.out.println("Max subarray sum is: " + maxSubArraySum);
    }
}
