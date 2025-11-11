public class OddEvenBitwise {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        int bitMask = 1;
        if((num & bitMask) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
