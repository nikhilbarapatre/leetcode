package BFS;

import java.util.*;

public class ZeroOneMatrix {
    public int[][] zeroOne(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0)
                    queue.offer(new int[]{i ,j});
                else
                    matrix[i][j] = Integer.MAX_VALUE;
            }
        }
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            for(int[] d : dirs){
                int r = curr[0] + d[0], c = curr[1] + d[1];
                if(r < 0 || r >= row || c < 0 || c >= col ||
                        matrix[r][c] <= matrix[curr[0]][curr[1]] + 1)
                    continue;
                queue.add(new int[]{r, c});
                matrix[r][c] = matrix[curr[0]][curr[1]] + 1;
            }
        }
        return matrix;
    }
}
