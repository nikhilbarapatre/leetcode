package DFS;

public class MaxAreaofIsland {
    public int maxAreadofIsland(int[][] grid){
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1)
                    maxArea = Math.max(maxArea, dfs(i, j, grid));
            }
        }
        return maxArea;
    }
    private int dfs(int i, int j, int[][] grid){
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            return 1 + dfs(i + 1, j, grid)
                     + dfs(i - 1, j, grid)
                     + dfs(i, j + 1, grid)
                     + dfs(i, j - 1, grid);
        }
        return 0;
    }

    public static void main(String[] args) {
        MaxAreaofIsland max = new MaxAreaofIsland();
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int result = max.maxAreadofIsland(grid);
        System.out.println(result);
    }
}
