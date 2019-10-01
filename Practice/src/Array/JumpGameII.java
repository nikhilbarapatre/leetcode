package Array;

public class JumpGameII {
    public int jumpGame2(int[] nums){
        int currFarthest = 0, currEnd = 0, jumps = 0;
        for(int i = 0; i < nums.length -1; i++){
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if(i == currEnd){
                jumps++;
                currEnd = currFarthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        JumpGameII jump = new JumpGameII();
        int[] nums = {2,3,1,1,4};
        int result = jump.jumpGame2(nums);
        System.out.println(result);
    }
}
