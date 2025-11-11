public class PowerOfTwo {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if( (num & num-1) == 0) {
            System.out.println("It is power of 2");
        } else {
            System.out.println("It is not power of 2");
        }
    }
}
