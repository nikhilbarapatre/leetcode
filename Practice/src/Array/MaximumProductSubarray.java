package Array;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums){
        if(nums.length == 0)
            return 0;
        int min = nums[0], max = nums[0], result = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }

    public static void main(String[] args) {
        MaximumProductSubarray max = new MaximumProductSubarray();
        int result = max.maxProduct(new int[]{2, 5, -2, 5});
        System.out.println(result);
    }
}
