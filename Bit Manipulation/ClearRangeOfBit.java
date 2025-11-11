public class ClearRangeOfBit {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        int intial = Integer.parseInt(args[1]);
        int end = Integer.parseInt(args[2]);

        int bitMaskA = (-1<<end);
        int bitMaskB = (1<<intial) -1;
        int finalBitMask = bitMaskA | bitMaskB;
        
        num = num & finalBitMask;
        System.out.println("New value is: " + num);
    }
}