package Array;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums){
        if(nums.length == 0)
            return 0;
        int[] table = new int[nums.length];
        table[0] = 1;
        int result = 1;
        for(int i = 1; i < nums.length; i++){
            int maxVal = 0;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j])
                    maxVal = Math.max(maxVal, table[j]);
                table[i] = maxVal + 1;
                result = Math.max(result, table[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence lon = new LongestIncreasingSubsequence();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lon.lengthOfLIS(nums));
    }
}
