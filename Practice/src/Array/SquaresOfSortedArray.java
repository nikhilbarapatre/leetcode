package Array;

import java.util.*;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A){
        int [] result = new int[A.length];
        for(int i = 0; i < A.length; i++){
            result[i] = A[i] * A[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray sq = new SquaresOfSortedArray();
        int[] input = new int[]{-4,-1,0,3,10};
        int[] result = sq.sortedSquares(input);
        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
