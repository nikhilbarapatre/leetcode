package DFS;

public class NumberOfIslands {
    public void numberOfIslands(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    dfsHelper(grid, i , j);
                }
            }
        }
    }

    private void dfsHelper(int[][] grid, int i, int j){
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            dfsHelper(grid, i - 1, j);
            dfsHelper(grid, i + 1, j);
            dfsHelper(grid, i , j - 1);
            dfsHelper(grid, i, j + 1);
        }
    }
}
