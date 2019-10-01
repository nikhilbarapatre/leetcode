package Array;

public class RemoveElement {
    public int remove(int[] nums, int val){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement rem = new RemoveElement();
        int result = rem.remove(new int[]{3, 4, 1, 1, 1, 4, 5, 4, 4, 4, 5, 6}, 4);
        System.out.println(result);
    }
}
