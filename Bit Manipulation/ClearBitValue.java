public class ClearBitValue {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int clearBit = Integer.parseInt(args[1]);
        int bitMask = ~(1<<clearBit);

        num = (num & bitMask);
        System.out.println("New value is: " + num);
    }
}
