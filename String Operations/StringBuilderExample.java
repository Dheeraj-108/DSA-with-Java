public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder(args[0]);

        sBuilder.setCharAt(0, Character.toUpperCase(sBuilder.charAt(0)));
        for(int i=1; i<sBuilder.length(); i++) {
            char ch = sBuilder.charAt(i);
            if(sBuilder.charAt(i-1) == ' ') {
               ch = Character.toUpperCase(ch); 
               sBuilder.setCharAt(i, ch);
            }
        }

        System.out.println("Updated string is: " + sBuilder);
    }
}
