package Array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums){
        if(nums.length == 1)
            return nums[0];
        int max = nums[0], curMax = nums[0];
        for(int i = 1; i < nums.length; i++){
            curMax = Math.max(curMax + nums[i], nums[i]);
            max = Math.max(curMax, max);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray max = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max.maxSubArray(nums));
    }
}
