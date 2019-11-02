package Array;

public class FirstAndLastPosition {
    public int[] firstAndLastPos(int[] nums, int target){
        int[] result = {-1, -1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                result[0] = i;
                break;
            }
        }
        if(result[0] == -1)
            return result;
        for(int j = nums.length - 1; j>= 0; j--){
            if(nums[j] == target){
                result[1] = j;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FirstAndLastPosition first = new FirstAndLastPosition();
        int[] nums = {5,7,7,8,8,10};
        int[] result = first.firstAndLastPos(nums, 8);
        for(int i : result)
            System.out.println(i);
    }
}
