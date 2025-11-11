public class ClearLastNBit {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int clearBits = Integer.parseInt(args[1]);
        int bitMask = ((-1)<<clearBits);

        num = num & bitMask;
        System.out.println("New value is: " + num);
    }
}
