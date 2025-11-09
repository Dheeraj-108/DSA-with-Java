public class TrappedRainWater {
    public static void main(String[] args) {
        int[] bars = {4, 2, 0, 6, 3, 2, 5};
        for(int i=0; i<bars.length; i++) {
            System.out.print(bars[i] + " ");
        }
        System.out.println("\n\n");

        int[] auxleft = new int[bars.length];
        auxleft[0] = bars[0];
        for(int i=1; i<bars.length; i++) {
            auxleft[i] = Math.max(bars[i], auxleft[i-1]);
        }

        int[] auxRight = new int[bars.length];
        auxRight[bars.length-1] = bars[bars.length-1];
        for(int i=bars.length-2; i>=0; i--) {
            auxRight[i] = Math.max(bars[i], auxRight[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<bars.length; i++) {
            int minHeight = Math.min(auxRight[i], auxleft[i]);
            trappedWater += minHeight - bars[i];
        }

        for(int i=0; i<bars.length; i++) {
            System.out.println(auxleft[i] + " " + auxRight[i]);
        }

        System.out.println("\n\nTrapped water: " + trappedWater);
    }
}
