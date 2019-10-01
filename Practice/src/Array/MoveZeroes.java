package Array;

public class MoveZeroes {
    public int[] moveZeroes(int[] nums){
        int numOfZeroes = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nums[numOfZeroes++] = nums[i];
        }
        for(int i = numOfZeroes; i < nums.length; i++)
            nums[i] = 0;
        return nums;
    }

    public static void main(String[] args) {
        MoveZeroes move = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        int [] result = move.moveZeroes(nums);
        for(int n : result)
            System.out.println(n);
    }
}
