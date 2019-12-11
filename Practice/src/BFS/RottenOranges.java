package BFS;

import java.util.*;

public class RottenOranges {
    public int rottenOranges(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0, totalOranges = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2)
                    queue.offer(new int[]{i, j});
                else if(grid[i][j] == 1)
                    freshOranges++;
            }
        }
        if(freshOranges == 0)
            return 0;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while(!queue.isEmpty()){
            totalOranges++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] curr = queue.poll();
                for(int[] dir : directions){
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];
                    if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    grid[x][y] = 2;
                    queue.offer(new int[]{x, y});
                    freshOranges--;
                }
            }
        }
        if(freshOranges == 0)
            return totalOranges - 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        RottenOranges rotten = new RottenOranges();
        int[][] grid = {{2,1,1}, {1,1,0}, {0,1,1}};
        System.out.println(rotten.rottenOranges(grid));
    }
}
