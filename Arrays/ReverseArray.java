public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        System.out.println("Array before reversing:- ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }

        System.out.println("\n\nArray after reversing:- ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
