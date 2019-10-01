package BFS;

public class JumpGame {
    public boolean jumpGame(int[] nums){
        int reach = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > reach)
                return false;
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame jump = new JumpGame();
        int[] nums = {3,2,1,2,4};
        System.out.println(jump.jumpGame(nums));
    }
}
