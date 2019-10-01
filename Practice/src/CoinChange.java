import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount){
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for(int i = 0; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i)
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        if(dp[amount] > amount)
            return -1;
        else
            return dp[amount];
    }

    public static void main(String[] args) {
        CoinChange coin = new CoinChange();
        int[] coins = {1, 2 ,5};
        int result = coin.coinChange(coins, 11);
        System.out.println(result);
    }
}
