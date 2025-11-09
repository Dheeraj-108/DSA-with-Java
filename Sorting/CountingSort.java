public class CountingSort {
    public static void main(String[] args) {
         int[] unsortedArr = {33, 66, 11, 55, 88, 22, 99, 77, 44};
        
        for(int i=0; i<unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + ", ");
        }

        // Finding largest value in the array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<unsortedArr.length; i++) {
            largest = Math.max(largest, unsortedArr[i]);
        }

        // Frequence storing
        int[] countArr = new int[largest+1];
        for(int i=0; i<unsortedArr.length; i++) {
            countArr[unsortedArr[i]]++;
        }

        //Sorting
        int j=0;
        for(int i=0; i<countArr.length; i++) {
            while(countArr[i] > 0) {
                unsortedArr[j] = i;
                countArr[i]--;
                j++; 
            }
        }

        System.out.println("\n\nArray after sorting:- ");
        for(int i=0; i<unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + ", ");
        }

    }
}
