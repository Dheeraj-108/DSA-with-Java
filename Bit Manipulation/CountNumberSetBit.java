public class CountNumberSetBit {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int bitMask = 1;
        int count = 0;

        while(num != 0) {
            if((num & bitMask) == 1) {
                count++;
            }
            num = num>>1;
        }

        System.out.println("Number of set bits is: " + count);
    }
}
