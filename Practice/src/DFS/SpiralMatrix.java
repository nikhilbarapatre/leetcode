package DFS;

import java.util.*;

public class SpiralMatrix {
    List<Integer> result = new ArrayList<>();
    public List<Integer> spiralMatrix(int[][] matrix){
        if(matrix.length == 0)
            return result;
        int[][] visited = new int[matrix.length][matrix[0].length];
        dfsTraverse(matrix, 0, 0, 0, visited);
        return result;
    }
    private void dfsTraverse(int[][] matrix, int i, int j, int dir, int[][] visited){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || visited[i][j] == 1)
            return;
        visited[i][j] = 1;
        result.add(matrix[i][j]);
        if(dir == 0){
            dfsTraverse(matrix, i, j + 1, 0, visited);
            dir = 1;
        }
        if(dir == 1){
            dfsTraverse(matrix, i + 1, j, 1, visited);
            dir = 2;
        }
        if(dir == 2){
            dfsTraverse(matrix, i, j - 1, 2, visited);
            dir = 3;
        }
        if(dir == 3){
            dfsTraverse(matrix, i - 1, j, 3, visited);
            dir = 0;
            dfsTraverse(matrix, i, j + 1, 0, visited);
        }
    }

    public static void main(String[] args) {
        SpiralMatrix spiral = new SpiralMatrix();
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}};
        List<Integer> result = spiral.spiralMatrix(matrix);
        for(int i = 0; i < result.size(); i++)
            System.out.print(result.get(i) + ", ");
    }
}
