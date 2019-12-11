package DFS;

import java.util.*;

public class NumberOfDistinctIslands {
    public int numOfDistinctIslands(int[][] grid){
        Set<String> set = new HashSet<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    StringBuilder sb = new StringBuilder();
                    dfsHelper(grid, i, j, sb, "origin");
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }
    private void dfsHelper(int[][] grid, int i, int j, StringBuilder sb, String direction){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return;
        sb.append(direction);
        grid[i][j] = 0;
        dfsHelper(grid, i - 1, j, sb, "up");
        dfsHelper(grid, i + 1, j, sb, "down");
        dfsHelper(grid, i, j - 1, sb, "left");
        dfsHelper(grid, i, j + 1, sb, "right");
        sb.append("back");
    }

    public static void main(String[] args) {
        NumberOfDistinctIslands num = new NumberOfDistinctIslands();
        int[][] grid = {{1,1,0,1,1},{1,0,0,0,0}, {0,0,0,0,1}, {1,1,0,1,1}};
        System.out.println(num.numOfDistinctIslands(grid));
    }
}
