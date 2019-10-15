package Array;

public class MinimumSizeSubarraySum {
    public int minSubarrayLen(int s, int[] nums){
        int result = Integer.MAX_VALUE;
        int start = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= s){
                result = Math.min(result, i + 1 - start);
                sum -= nums[start++];
            }
        }
        if(result != Integer.MAX_VALUE)
            return result;
        else
            return 0;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum min = new MinimumSizeSubarraySum();
        int[] nums = {2,3,1,2,4,3};
        System.out.println(min.minSubarrayLen(7, nums));
    }
}
