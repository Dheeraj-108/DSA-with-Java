public class ShortestPath {
    public static void main(String args[]) {
        String direction = "WNEENESENNN";

        int xDirection=0, yDirection=0;

        for(int i=0; i<direction.length(); i++) {
            if(direction.charAt(i) == 'W') {
                xDirection--;
            } else if(direction.charAt(i) == 'E') {
                xDirection++;
            } else if(direction.charAt(i) == 'N') {
                yDirection++;
            } else if(direction.charAt(i) == 'S') {
                yDirection--;
            } else {
                System.out.println("Invalid directoin");
                continue;
            }
        }

        double finalDisp = Math.sqrt((xDirection*xDirection) + (yDirection*yDirection));
        System.out.println("Shortest distance is: " + finalDisp);
    }
}
