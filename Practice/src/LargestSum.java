
import Array.IntersectionOf2Arrays;

import java.util.*;

public class LargestSum {
//    Map<Diagonal, Integer> map = new HashMap<>();
//    public int largestSum(int[][] nums){
//        for(int i = 0; i < nums.length; i++){
//            for(int j = 0 ; j < nums[0].length; j++){
//                int a = i - j;
//                int b = i + j;
//                int val = nums[i][j];
//
//                    Diagonal currentDiagonal = findDiagonal(i, j, 1);
//                    int currentSum = currentDiagonal.getSum(currentDiagonal);
//                    currentSum += val;
//                    currentDiagonal.setSum(currentDiagonal,currentSum);
//
//
//            }
//        }
//        return 0;
//    }
//    public Diagonal findDiagonal(int row, int col, int slope){
//        if(slope == 1){
//
//        }
//
//    }
//    public class Diagonal{
//        int a, b;
//        int sum;
//        public Integer getSum(Diagonal diagonal){
//            return map.get(diagonal);
//        }
//        public void setSum(Diagonal curr, int currentS){
//            map.put(curr, currentS);
//        }
//    }

    //Here, since I have two slopes, i.e. two directions of the diagonals, I create a class Diagonal to maintain the
    //left and right sum.

    private class Diagonal{
        int leftSum;
        int rightSum;
        public Diagonal(int leftSum, int rightSum){
            this.leftSum = leftSum;
            this.rightSum = rightSum;
        }
    }
    public int largestSum(int[][] nums){
        Diagonal[][] cache = new Diagonal[nums.length][nums.length];
        int result = Integer.MIN_VALUE;
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[0].length; col++){
                if(row == 0)
                    cache[row][col] = new Diagonal(nums[row][col], nums[row][col]);
                else{
                    int rightSum = 0, leftSum = 0;
                    if(row - 1 >= 0 && col + 1 < nums[row - 1].length){
                        rightSum = cache[row - 1][col + 1].rightSum;
                    }
                    if(row - 1 >= 0 && col - 1 >= 0){
                        leftSum = cache[row - 1][col - 1].leftSum;
                    }
                    cache[row][col] = new Diagonal(leftSum + nums[row][col], rightSum + nums[row][col]);
                }
            }
        }
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[0].length; col++){
                if(row - 1 < 0 || row + 1 == nums.length)
                    result = Math.max(result, Math.max(cache[row][col].leftSum, cache[row][col].rightSum));
                }
            }
        return result;
    }

    public static void main(String[] args) {
        LargestSum largest = new LargestSum();
        int[][] nums = {{-20, -10, -10}, {-10, -100, -1}, {9, -10, 100}};
        int result = largest.largestSum(nums);
        System.out.println(result);
    }
}
