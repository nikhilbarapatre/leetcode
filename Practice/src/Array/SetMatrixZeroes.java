package Array;

import java.util.*;

public class SetMatrixZeroes {
    public int[][] setMatrixZeroes(int[][] matrix){
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(rows.contains(i) || cols.contains(j))
                    matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        SetMatrixZeroes set = new SetMatrixZeroes();
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] result = set.setMatrixZeroes(matrix);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
