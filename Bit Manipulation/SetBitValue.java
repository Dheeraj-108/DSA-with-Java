public class SetBitValue {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int setBit = Integer.parseInt(args[1]);
        int bitMask = (1<<setBit);

        num = (num | bitMask);
        System.out.println("New value is: " + num);
    }
}
