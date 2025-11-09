public class StringCompression {
    public static void main(String[] args) {
        String userInput = args[0];
        StringBuilder sBuilder = new StringBuilder("");

        for(int i=0; i<userInput.length(); i++) {
            Integer count=1;
            while (i < userInput.length()-1 && userInput.charAt(i) == userInput.charAt(i+1)) {
                count++;
                i++;
            }
            sBuilder.append(userInput.charAt(i));
            if(count > 1) {
                sBuilder.append(count.toString());
            }
        }

        System.out.println("Original String: " + userInput + " | Compressed String: " + sBuilder);
    }
}
