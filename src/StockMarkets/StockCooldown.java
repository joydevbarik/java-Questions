public class StockCooldown {

    public static int maxProfit(int[] prices) {

        int buy = -prices[0];
        int sell = 0;
        int cooldown = 0;

        for (int i = 1; i < prices.length; i++) {

            int prevBuy = buy;
            int prevSell = sell;

            buy = Math.max(buy, cooldown - prices[i]);

            sell = Math.max(sell, prevBuy + prices[i]);

            cooldown = prevSell;
        }

        return sell;
    }

    public static void main(String[] args) {

        int[] prices = {1,2,3,0,2};

        System.out.println(maxProfit(prices));
    }
}