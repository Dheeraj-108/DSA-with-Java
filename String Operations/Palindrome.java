public class Palindrome {
    public static void main(String[] args) {
        String palin = "racepcar";

        for(int i=0; i<palin.length()/2; i++) {
            if(palin.charAt(i) != palin.charAt(palin.length()-1-i)) {
                System.out.println("Its not palindrome");
                break;
            }
        }
    }
}
