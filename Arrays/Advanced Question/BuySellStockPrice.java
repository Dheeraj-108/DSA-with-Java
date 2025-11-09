public class BuySellStockPrice {
    public static void main(String[] args) {
        int[] prices = {34, 75, 23, 81, 19, 53};

        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = Integer.MIN_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                
                if(profit > maxProfit) {
                    maxProfit = profit;
                    sellPrice = prices[i];
                }
            } else {
                buyPrice = prices[i];
            }
        }

        System.out.println("Buy Price: " + buyPrice + " | Sell Price: " + sellPrice);
    }
}
