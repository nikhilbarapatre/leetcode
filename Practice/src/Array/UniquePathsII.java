package Array;

public class UniquePathsII {
    public int uniquePaths2(int[][] obstacleGrid){
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for(int[] row : obstacleGrid){
            for(int j = 0; j < width; j++){
                if(row[j] == 1)
                    dp[j] = 0;
                else if(j > 0)
                    dp[j] += dp[j - 1];
            }
        }
        return dp[width - 1];
    }

    public static void main(String[] args) {
        UniquePathsII un2 = new UniquePathsII();
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(un2.uniquePaths2(obstacleGrid));
    }
}
