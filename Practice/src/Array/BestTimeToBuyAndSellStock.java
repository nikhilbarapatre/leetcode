package Array;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice)
                minPrice = prices[i];
            else if(prices[i] - minPrice > max)
                max = prices[i] - minPrice;
        }
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock best = new BestTimeToBuyAndSellStock();
        int[] price = new int[]{7,1,5,3,6,4};
        int result = best.maxProfit(price);
        System.out.println(result);
    }
}
