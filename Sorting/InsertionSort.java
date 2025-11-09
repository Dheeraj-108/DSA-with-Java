public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArr = {33, 66, 11, 55, 88, 22, 99, 77, 44};

        for(int i=0; i<unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + ", ");
        }

        for(int i=1; i<unsortedArr.length; i++) {
            int prev = i-1;
            int currElement = unsortedArr[i];
            while(prev >= 0 && unsortedArr[prev] > currElement) {
                unsortedArr[prev+1] = unsortedArr[prev];
                prev--;
            }
            unsortedArr[prev+1] = currElement;
        }

        System.out.println("\n\nArray after sorting:- ");
        for(int i=0; i<unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + ", ");
        }
    }
}
