public class GetBitValue {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        int getBit = Integer.parseInt(args[1]);
        int bitMask = (1<<getBit);

        if((num & bitMask) != 0) {
            System.out.println("Bit at position " + getBit + " is: " + 1);
        } else {
            System.out.println("Bit at position " + getBit + " is: " + 0);
        }
    }
}
