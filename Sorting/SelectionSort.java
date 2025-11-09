public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArr = {33, 66, 11, 55, 88, 22, 99, 77, 44};

        for(int i=0; i<unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + ", ");
        }

        for(int i=0; i<unsortedArr.length-1; i++) {
            int minIdx = i;
            for(int j=i+1; j<unsortedArr.length; j++) {
                if(unsortedArr[minIdx] > unsortedArr[j]){
                    minIdx = j;
                }
            }
            int temp = unsortedArr[i];
            unsortedArr[i] = unsortedArr[minIdx];
            unsortedArr[minIdx] = temp;
        }

        System.out.println("\n\nArray after sorting:- ");
        for(int i=0; i<unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + ", ");
        }
    }
}
