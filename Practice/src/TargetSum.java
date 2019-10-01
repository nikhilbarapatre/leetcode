public class TargetSum {
    int count = 0;
    public int targetSum(int[] nums, int S){
        calculate(nums, 0, 0, S);
        return count;
    }
    private void calculate(int[] nums, int i, int sum, int S){
        if(i == nums.length){
            if(sum == S)
                count++;
        }
        else{
            calculate(nums, i + 1, sum + nums[i], S);
            calculate(nums, i + 1, sum - nums[i], S);
        }
    }

    public static void main(String[] args) {
        TargetSum tar = new TargetSum();
        int[] nums = {1, 1, 1, 1, 1};
        int result = tar.targetSum(nums, 3);
        System.out.println(result);
    }
}
