package Array;

public class LongestContinuousIncreasingSub {
    public int findLengthOfLCIS(int[] nums){
        if(nums.length == 0)
            return 0;
        int len = 1;
        int maxLen = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                len++;
                maxLen = Math.max(len, maxLen);
            }
            else
                len = 1;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSub lon = new LongestContinuousIncreasingSub();
        int result = lon.findLengthOfLCIS(new int[]{1,3,5,4,7});
        System.out.println(result);
    }
}
