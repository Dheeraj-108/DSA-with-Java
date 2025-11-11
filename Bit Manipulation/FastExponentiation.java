public class FastExponentiation {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int pow = Integer.parseInt(args[1]);

        int ans = 1;
        while(pow > 0) {
            if((pow & 1) != 0) {
                ans = ans*num;
            }
            num *= num;
            pow= pow>>1;
        }

        System.out.println("Value is: " + ans);
    }
}
