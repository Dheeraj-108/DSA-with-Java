public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArr = {33, 66, 11, 55, 88, 22, 99, 77, 44};

        for(int i=0; i<unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + ", ");
        }

        for(int i=0; i<unsortedArr.length; i++) {
            for(int j=1; j<unsortedArr.length-i; j++) {
                
                if(unsortedArr[j] > unsortedArr[j-1]) { // It is compararing with the previous element.
                    int temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j-1];
                    unsortedArr[j-1] = temp;  
                }
            }
        }

        System.out.println("\n\nArray after sorting:- ");
        for(int i=0; i<unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + ", ");
        }
    }
}
