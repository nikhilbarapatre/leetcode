package Array;


/*
* Here we use Sliding Window Protocol.
* First we calculate sum of k numbers and then caluclate sum of the remaining elements and check for maximum sum.
* The maximum sum is stored in result and then the desired average is returned as result / k.
* */

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k){
        double sum = 0;
        for(int i = 0; i < k; i++)
            sum += nums[i];
        double result = sum;
        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            result = Math.max(result, sum);
        }
        return result / k;
    }

    public static void main(String[] args) {
        MaximumAverageSubarray max = new MaximumAverageSubarray();
        double res = max.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4);
        System.out.println(res);
    }
}
